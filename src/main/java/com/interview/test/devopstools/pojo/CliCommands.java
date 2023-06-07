package com.interview.test.devopstools.pojo;

import java.util.List;
import lombok.Data;

@Data
public class CliCommands {

    private String tool;
    private String shorthand;
    private List<CliCommand> commands;

    public String getAnchor() {
        return getTool().toLowerCase().replace(" ", "");
    }
}
