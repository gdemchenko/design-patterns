package com.example.design.patterns.general.command.command.impl;

import com.example.design.patterns.general.command.command.Command;

public class NoCommand implements Command {

    @Override
    public void execute() {
        System.out.println("no command given");
    }

    @Override
    public void undo() {
        System.out.println("nothing to undo");
    }
}
