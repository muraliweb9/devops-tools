package com.interview.test.devopstools.pojo;

import java.util.Collections;
import java.util.List;
import lombok.Data;

@Data
public class CliCommands implements Comparable<CliCommands> {

    private String tool;
    private String shorthand;
    private List<CliCommand> commands;

    public void setCommands(List<CliCommand> commands) {
        this.commands = commands;
        Collections.sort(commands);
    }

    public String getAnchor() {
        return getTool().toLowerCase().replace(" ", "");
    }

    @Override
    public int compareTo(CliCommands o) {
        return getTool().compareTo(o.getTool());
    }
}
