package com.example.design.patterns.general.composition.command.invoker;

import com.example.design.patterns.general.composition.command.command.Command;
import com.example.design.patterns.general.composition.command.command.impl.NoCommand;

public class RemoteControl {

    private static final int SLOTS_AMOUNT = 7;
    
    private Command[] onCommands;
    private Command[] offCommands;

    public RemoteControl() {
        onCommands = new Command[SLOTS_AMOUNT];
        offCommands = new Command[SLOTS_AMOUNT];

        for (int i = 0; i < SLOTS_AMOUNT; i++) {
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }
    }
    
    public void setCommand(final int slot, final Command onCommand, final Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }
    
    public void onButonPushed(final int slot) {
        onCommands[slot].execute();
    }
    
    public void offButonPushed(final int slot) {
        offCommands[slot].execute();
    }
}
