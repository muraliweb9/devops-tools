package com.interview.test.devopstools;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.interview.test.devopstools.pojo.CliCommands;
import java.io.File;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CommandsGenerator implements Runnable {

    private static final String COMMANDS_FOLDER_NAME = "commands";

    public static void main(String[] args) {
        new CommandsGenerator().run();
    }

    @Override
    public void run() {
        log.info("Generating DevOps commands ....");
        List<File> commandsFiles = getCommandsFiles();
        List<CliCommands> cliCommands = getCiCommands(commandsFiles);

        List<ScriptsGenerator> scriptsGens =
                Arrays.asList(new BatchScriptsGenerator(cliCommands), new BashScriptsGenerator(cliCommands));

        scriptsGens.forEach(s -> s.run());
        log.info("Finished generating DevOps commands");
    }

    private List<File> getCommandsFiles() {
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        URL url = loader.getResource(COMMANDS_FOLDER_NAME);
        String path = url.getPath();
        File[] files = new File(path).listFiles();
        return Arrays.asList(files).stream().collect(Collectors.toList());
    }

    private List<CliCommands> getCiCommands(List<File> commandsFiles) {
        return commandsFiles.stream().map(f -> loadCliCommands(f)).collect(Collectors.toList());
    }

    @SneakyThrows
    private CliCommands loadCliCommands(File commandsFile) {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(commandsFile, CliCommands.class);
    }
}
