package com.interview.test.devopstools.pojo;

import lombok.Data;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Data
public class CliCommands implements Comparable<CliCommands> {

    private String tool;
    private String shorthand;
    private List<CliCommand> commands;

    public void setCommands(List<CliCommand> commands) {
        this.commands = commands;
        Collections.sort(commands);
    }

    public List<String> getShortCuts() {
        return commands.stream()
                .filter(c -> c.getShortcut() != null)
                .map(c -> c.getShortcut())
                .collect(Collectors.toList());
    }

    public String getAnchor() {
        return getTool().toLowerCase().replace(" ", "");
    }

    @Override
    public int compareTo(CliCommands o) {
        return getTool().compareTo(o.getTool());
    }
}
