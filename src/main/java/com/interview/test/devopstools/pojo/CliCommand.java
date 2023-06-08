package com.interview.test.devopstools.pojo;

import lombok.Data;

@Data
public class CliCommand implements Comparable<CliCommand> {

    private String command;
    private String desc;
    private String shortcut;
    private String code;
    private String example;

    public String getCodeEscaped() {
        return code.replace("%", "%%");
    }

    public String getShortcutEscaped() {
        if (getShortcut() == null) {
            return "null";
        }
        return getShortcut();
    }

    @Override
    public int compareTo(CliCommand o) {
        return getShortcutEscaped().compareTo(o.getShortcutEscaped());
    }
}
