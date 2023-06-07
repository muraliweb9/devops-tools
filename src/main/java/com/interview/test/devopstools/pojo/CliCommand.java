package com.interview.test.devopstools.pojo;

import lombok.Data;

@Data
public class CliCommand {

    private String command;
    private String desc;
    private String shortcut;
    private String code;
    private String example;
}
