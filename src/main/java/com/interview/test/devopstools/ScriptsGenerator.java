package com.interview.test.devopstools;

import com.interview.test.devopstools.pojo.CliCommand;
import com.interview.test.devopstools.pojo.CliCommands;
import java.io.File;
import java.io.PrintWriter;
import java.util.List;
import lombok.SneakyThrows;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.springframework.util.FileSystemUtils;

public interface ScriptsGenerator extends Runnable {

    Logger log = org.slf4j.LoggerFactory.getLogger(ScriptsGenerator.class);

    String getName();

    String getOutputFolder();

    String getStaticFolder();

    List<CliCommands> getCliCommands();

    @Override
    default void run() {
        log.info("Generating {} commands ....", getName());
        createFolderStructure();
        copyStaticScripts();
        writeDynamicScripts(getCliCommands());
        log.info("Finished generating {} commands ....", getName());
    }

    default void createFolderStructure() {
        log.info("Creating {} folder structure ....", getName());
        createFolderStructure(getOutputFolder());
        log.info("Finished creating {} folder structure ....", getName());
    }

    private void createFolderStructure(String folderName) {
        File folder = new File("src/main/resources/" + folderName);
        boolean deleted = FileSystemUtils.deleteRecursively(folder);
        boolean created = folder.mkdir();
        log.info("Folder {} was deleted {} and created {}", folder.getAbsoluteFile(), deleted, created);
    }

    @SneakyThrows
    default void copyStaticScripts() {
        log.info("Copying {} static scripts ....", getName());
        File src = new File("src/main/resources/" + getStaticFolder());
        File dest = new File("src/main/resources/" + getOutputFolder());
        FileUtils.copyDirectory(src, dest);
        log.info("Finished copying {} static scripts ....", getName());
    }

    default void writeDynamicScripts(List<CliCommands> cliCommands) {
        cliCommands.stream().forEach(c -> writeDynamicScripts(c));
    }

    @SneakyThrows
    private void writeDynamicScripts(CliCommands cliCommands) {

        log.info(
                "Generating {} commands for {} with prefix {}",
                cliCommands.getCommands().size(),
                cliCommands.getTool(),
                cliCommands.getShorthand());
        String tool = cliCommands.getTool();
        String shortHand = cliCommands.getShorthand();
        File folder = new File("src/main/resources/" + getOutputFolder());
        File batchFile = new File(folder, shortHand + ".bat");
        batchFile.createNewFile();

        List<CliCommand> clis = cliCommands.getCommands();
        clis.stream().forEach(c -> writeDynamicScripts(tool, shortHand, c));

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
        return "echo " + pad(cli.shortcutEscaped(), 10)
                + "-^> "
                + pad(cli.getCodeEscaped(), 30)
                + "-^> "
                + pad(cli.getExample(), 20);
    }

    private String pad(String str, int size) {
        return StringUtils.rightPad(str, size, " ");
    }

    @SneakyThrows
    private void writeDynamicScripts(String tool, String shortHand, CliCommand cliCommand) {
        String command = cliCommand.getCodeEscaped();
        String desc = cliCommand.getDesc();
        String shortcut = cliCommand.getShortcut();
        String code = cliCommand.getCode();
        String example = cliCommand.getExample();

        log.info("Writing batch for tool {} shorthand {} shortcut {}", tool, shortHand, shortcut);

        if (shortcut != null) {
            File folder = new File("src/main/resources/" + getOutputFolder());
            File batchFile = new File(folder, shortcut + ".bat");
            batchFile.createNewFile();

            PrintWriter writer = new PrintWriter(batchFile);
            writer.println(code);
            writer.close();
            log.info("Wrote batch for tool {} shorthand {} shortcut {}", tool, shortHand, shortcut);
        } else {
            log.info("Skipping batch for tool {} shorthand {} shortcut {}", tool, shortHand, shortcut);
        }
    }
}
