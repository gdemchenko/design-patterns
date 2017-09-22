package com.example.design.patterns.general.composition.command.command.impl;

import com.example.design.patterns.general.composition.command.command.Command;
import com.example.design.patterns.general.composition.command.receiver.Light;

public class LightOffCommand implements Command {

    Light light;

    public LightOffCommand(final Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
