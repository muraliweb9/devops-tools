package com.interview.test.devopstools;

import com.interview.test.devopstools.pojo.CliCommands;
import java.util.List;

public class BatchScriptsGenerator implements ScriptsGenerator {

    private static final String BATCH_GEN_NAME = "Batch Script Generator";
    private static final String BATCH_FOLDER_NAME = "batch";
    private static final String BATCH_STATIC_FOLDER_NAME = "batch-static";

    private List<CliCommands> cliCommands;

    public BatchScriptsGenerator(List<CliCommands> cliCommands) {
        this.cliCommands = cliCommands;
    }

    @Override
    public String getName() {
        return BATCH_GEN_NAME;
    }

    @Override
    public String getOutputFolder() {
        return BATCH_FOLDER_NAME;
    }

    @Override
    public String getStaticFolder() {
        return BATCH_STATIC_FOLDER_NAME;
    }

    @Override
    public List<CliCommands> getCliCommands() {
        return cliCommands;
    }
}
