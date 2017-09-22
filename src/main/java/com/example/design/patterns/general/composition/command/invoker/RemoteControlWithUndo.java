package com.example.design.patterns.general.composition.command.invoker;

import com.example.design.patterns.general.composition.command.command.Command;
import com.example.design.patterns.general.composition.command.command.impl.NoCommand;

public class RemoteControlWithUndo {

    private static final int SLOTS_AMOUNT = 7;

    private Command[] onCommands;
    private Command[] offCommands;
    private Command undoCommand;

    public RemoteControlWithUndo() {
        onCommands = new Command[SLOTS_AMOUNT];
        offCommands = new Command[SLOTS_AMOUNT];
        Command noCommand = new NoCommand();

        for (int i = 0; i < SLOTS_AMOUNT; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommand = noCommand;
    }
    
    public void setCommand(final int slot, final Command onCommand, final Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }
    
    public void onButonPushed(final int slot) {
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }
    
    public void offButonPushed(final int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void undoButtonPushed() {
        undoCommand.undo();
    }
}
