package com.example.design.patterns.general.command.command.impl;

import com.example.design.patterns.general.command.command.Command;
import com.example.design.patterns.general.command.receiver.Stereo;

public class StereoOnWithCDCommand implements Command {

    private Stereo stereo;

    public StereoOnWithCDCommand(final Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(2);
    }

    @Override
    public void undo() {
        stereo.off();
    }
}
