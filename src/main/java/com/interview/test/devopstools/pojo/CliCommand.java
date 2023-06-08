package com.interview.test.devopstools.pojo;

import java.util.HashMap;
import java.util.Map;
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

    public String getActual() {
        String code = getCode();
        Map<String, String> actuals = new HashMap<>();
        String[] exampleComponents = getExample().split(" ");
        int index = 0;
        for (String exampleComponent : exampleComponents) {
            actuals.put("%" + index++, exampleComponent);
        }
        for (Map.Entry<String, String> e : actuals.entrySet()) {
            code = code.replace(e.getKey(), e.getValue());
        }
        return code;
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
