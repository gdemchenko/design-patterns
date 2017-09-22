package com.example.design.patterns.general.composition.command.command.impl;

import com.example.design.patterns.general.composition.command.command.Command;
import com.example.design.patterns.general.composition.command.receiver.Light;

public class LightOnCommand implements Command {

    Light light;

    public LightOnCommand(final Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
