package com.example.design.patterns.general.command.command.impl;

import com.example.design.patterns.general.command.command.Command;
import com.example.design.patterns.general.command.receiver.CeilingFan;

public class CeilingFanOffCommand implements Command {

    CeilingFan ceilingFan;

    public CeilingFanOffCommand(final CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        ceilingFan.off();
    }

    @Override
    public void undo() {
        ceilingFan.on();
    }
}
