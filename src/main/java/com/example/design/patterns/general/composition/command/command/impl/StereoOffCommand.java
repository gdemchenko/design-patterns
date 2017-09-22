package com.example.design.patterns.general.composition.command.command.impl;

import com.example.design.patterns.general.composition.command.command.Command;
import com.example.design.patterns.general.composition.command.receiver.Stereo;

public class StereoOffCommand implements Command {

    private Stereo stereo;

    public StereoOffCommand(final Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();
    }

    @Override
    public void undo() {
        stereo.on();
    }
}
