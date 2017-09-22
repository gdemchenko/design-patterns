package com.example.design.patterns.general.composition.command.command.impl;

import com.example.design.patterns.general.composition.command.command.Command;
import com.example.design.patterns.general.composition.command.receiver.GarageDoor;

public class GarageDoorDownCommand implements Command {

    GarageDoor garageDoor;

    public GarageDoorDownCommand(final GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.down();
    }

    @Override
    public void undo() {
        garageDoor.up();
    }
}
