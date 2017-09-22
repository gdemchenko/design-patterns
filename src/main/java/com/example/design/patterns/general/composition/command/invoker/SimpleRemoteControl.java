package com.example.design.patterns.general.composition.command.invoker;

import com.example.design.patterns.general.composition.command.command.Command;

public class SimpleRemoteControl {

    Command slot;

    public SimpleRemoteControl() {

    }

    public void setCommand(final Command command) {
        this.slot = command;
    }

    public void buttonPressed() {
        slot.execute();
    }

}
