package com.interview.test.devopstools;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.interview.test.devopstools.pojo.CliCommand;
import com.interview.test.devopstools.pojo.CliCommands;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;

import java.io.File;
import java.io.PrintWriter;
import java.net.URL;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

@Slf4j
public class CommandsGenerator implements Runnable {

    private static final String COMMANDS_FOLDER_NAME = "commands";

    private static final String README_CLI_FILE = "README-CLI.md";

    public static void main(String[] args) {
        new CommandsGenerator().run();
    }

    @Override
    public void run() {
        log.info("Generating DevOps commands ....");
        List<File> commandsFiles = getCommandsFiles();
        List<CliCommands> cliCommands = getCiCommands(commandsFiles);

        validate(cliCommands);

        List<ScriptsGenerator> scriptsGens =
                Arrays.asList(new BatchScriptsGenerator(cliCommands), new BashScriptsGenerator(cliCommands));

        scriptsGens.forEach(s -> s.run());

        createReadMe(cliCommands);
        log.info("Finished generating DevOps commands");
    }

    @SneakyThrows
    private void validate(List<CliCommands> cliCommands) {

        Map<String, Long> byShortHand = cliCommands.stream().collect(
                Collectors.groupingBy(CliCommands::getShorthand, Collectors.counting()));
        byShortHand.entrySet().stream().forEach(e -> {
            if (e.getValue() > 1) {
                log.error("Command shorthand [{}] is defined in [{}] places", e.getKey(), e.getValue());
                throw new RuntimeException(
                        String.format("Command shorthand [%s] is defined in [%s] places", e.getKey(), e.getValue())
                );
            }
        });

        Optional<List<String>> shortCuts
                = cliCommands.stream()
                .map((c) -> c.getShortCuts())
                .reduce((x, y) -> {
                    x.addAll(y);
                    return x;
                });

        Map<String, Long> byShortCut = shortCuts.get().stream().collect(
                Collectors.groupingBy(s -> s, Collectors.counting()));

        byShortCut.entrySet().stream().forEach(e -> {
            if (e.getValue() > 1) {
                log.error("Command shortcut [{}] is defined in [{}] places", e.getKey(), e.getValue());
                throw new RuntimeException(
                        String.format("Command shortcut [%s] is defined in [%s] places", e.getKey(), e.getValue())
                );
            }
        });
    }

    @SneakyThrows
    private void createReadMe(List<CliCommands> cliCommands) {
        File readMe = new File(README_CLI_FILE);
        if (readMe.exists()) {
            boolean deleted = readMe.delete();
            log.info("{} existed and was deleted {}", README_CLI_FILE, deleted);
        }
        PrintWriter writer = new PrintWriter(README_CLI_FILE);

        writer.println(getReadMe(cliCommands));

        writer.close();
    }

    private String getReadMe(List<CliCommands> cliCommands) {

        StringBuilder readMe = new StringBuilder();

        readMe.append("# DevOps Scripts\n");
        readMe.append("## Table of Contents\n");
        int count = 1;
        for (CliCommands tool : cliCommands) {
            readMe.append(count + ". [" + tool.getTool() + "](#" + tool.getAnchor() + ")\n");
            count++;
        }

        for (CliCommands tool : cliCommands) {
            readMe.append("<a name=\"" + tool.getAnchor() + "\"></a><br>" + "\n");
            readMe.append("## " + tool.getTool() + "\n");
            //readMe.append("<hr/>\n");
            for (CliCommand cliCommand : tool.getCommands()) {
                readMe.append("### <ins>" + cliCommand.getShortcutEscaped() + "</ins>\n");
                readMe.append("<b>Desc:   </b>" + "" + cliCommand.getDesc() + "" + "<br>\n");
                readMe.append("<b>Usage:  </b>" + "``" + cliCommand.getExample() + "``" + "<br>\n");
                readMe.append("<b>Actual: </b>" + "``" + cliCommand.getActual() + "``" + "<br>\n");
            }
        }

        return readMe.toString();
    }

    private List<File> getCommandsFiles() {
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        URL url = loader.getResource(COMMANDS_FOLDER_NAME);
        String path = url.getPath();
        File[] files = new File(path).listFiles();
        return Arrays.asList(files).stream().collect(Collectors.toList());
    }

    private List<CliCommands> getCiCommands(List<File> commandsFiles) {
        List<CliCommands> cliCommands =
                commandsFiles.stream().map(f -> loadCliCommands(f)).collect(Collectors.toList());
        Collections.sort(cliCommands);
        return cliCommands;
    }

    @SneakyThrows
    private CliCommands loadCliCommands(File commandsFile) {
        log.info("Loading command file [{}]", commandsFile.getName());
        ObjectMapper mapper = new ObjectMapper();
        CliCommands cliCommands = mapper.readValue(commandsFile, CliCommands.class);
        log.info("Shorthand [{}] for command file [{}]", cliCommands.getShorthand(), commandsFile.getName());
        return cliCommands;
    }
}
