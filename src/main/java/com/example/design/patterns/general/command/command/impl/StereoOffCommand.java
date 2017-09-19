package com.example.design.patterns.general.command.command.impl;

import com.example.design.patterns.general.command.command.Command;
import com.example.design.patterns.general.command.receiver.Stereo;

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
