package com.interview.test.devopstools;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.interview.test.devopstools.pojo.CliCommand;
import com.interview.test.devopstools.pojo.CliCommands;
import java.io.File;
import java.io.PrintWriter;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.util.FileSystemUtils;

@Slf4j
public class CommandsGenerator implements Runnable {
    public static void main(String[] args) {
        new CommandsGenerator().run();
    }

    @Override
    public void run() {
        log.info("Generating DevOps commands ....");
        List<File> commandsFiles = getCommandsFiles();
        List<CliCommands> cliCommands = getCiCommands(commandsFiles);
        createFolderStructure();
        writeBatchCommands(cliCommands);
        log.info("Finished generating DevOps commands");
    }

    private List<File> getCommandsFiles() {
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        URL url = loader.getResource("commands");
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

    private void createFolderStructure() {

        List<String> folders = Arrays.asList("batch2", "bash");
        folders.stream().forEach(f -> createFolderStructure(f));
    }

    private void createFolderStructure(String folderName) {
        File folder = new File("src/main/resources/" + folderName);
        boolean deleted = FileSystemUtils.deleteRecursively(folder);
        boolean created = folder.mkdir();
        log.info("Folder {} was deleted {} and created {}", folder.getAbsoluteFile(), deleted, created);
    }

    private void writeBatchCommands(List<CliCommands> cliCommands) {

        cliCommands.stream().forEach(c -> writeBatchCommands(c));
    }

    @SneakyThrows
    private void writeBatchCommands(CliCommands cliCommands) {

        String tool = cliCommands.getTool();
        String shortHand = cliCommands.getShorthand();
        File folder = new File("src/main/resources/batch2");
        File batchFile = new File(folder, shortHand + ".bat");
        batchFile.createNewFile();

        List<CliCommand> clis = cliCommands.getCommands();
        clis.stream().forEach(c -> writeBatchCommand(tool, shortHand, c));

        PrintWriter writer = new PrintWriter(batchFile);
        String banner = tool + " Short Cuts";

        int bannerLen = banner.length();
        String padded = StringUtils.leftPad("", bannerLen, "=");
        writer.println("@echo off");
        writer.println("echo " + padded);
        writer.println("echo " + banner);
        writer.println("echo " + padded);
        clis.stream().forEach(c -> writer.println(cliHelp(c)));
        writer.close();
    }

    private String cliHelp(CliCommand cli) {
        return "echo " + pad(cli.getShortcut(), 10)
                + "-^> "
                + pad(cli.getCode(), 20)
                + "-^> "
                + pad(cli.getExample(), 20);
    }

    private String pad(String str, int size) {
        return StringUtils.rightPad(str, size, " ");
    }

    @SneakyThrows
    private void writeBatchCommand(String tool, String shortHand, CliCommand cliCommand) {
        String command = cliCommand.getCommand();
        String desc = cliCommand.getDesc();
        String shortcut = cliCommand.getShortcut();
        String code = cliCommand.getCode();
        String example = cliCommand.getExample();

        File folder = new File("src/main/resources/batch2");
        File batchFile = new File(folder, shortcut + ".bat");
        batchFile.createNewFile();

        PrintWriter writer = new PrintWriter(batchFile);
        writer.println(code);
        writer.close();
    }
}
