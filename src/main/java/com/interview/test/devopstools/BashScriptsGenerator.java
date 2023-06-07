package com.interview.test.devopstools;

import com.interview.test.devopstools.pojo.CliCommands;
import java.util.List;

public class BashScriptsGenerator implements ScriptsGenerator {

    private static final String BASH_GEN_NAME = "Bash Script Generator";
    private static final String BASH_FOLDER_NAME = "bash";
    private static final String BASH_STATIC_FOLDER_NAME = "bash-static";

    private List<CliCommands> cliCommands;

    public BashScriptsGenerator(List<CliCommands> cliCommands) {
        this.cliCommands = cliCommands;
    }

    @Override
    public String getName() {
        return BASH_GEN_NAME;
    }

    @Override
    public String getOutputFolder() {
        return BASH_FOLDER_NAME;
    }

    @Override
    public String getStaticFolder() {
        return BASH_STATIC_FOLDER_NAME;
    }

    @Override
    public List<CliCommands> getCliCommands() {
        return cliCommands;
    }

    @Override
    public void writeDynamicScripts(List<CliCommands> cliCommands) {
        // Don't do anything
    }
}
