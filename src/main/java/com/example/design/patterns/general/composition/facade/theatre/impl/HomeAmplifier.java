package com.example.design.patterns.general.composition.facade.theatre.impl;

import com.example.design.patterns.general.composition.facade.theatre.Amplifier;
import com.example.design.patterns.general.composition.facade.theatre.DiskPlayer;

public class HomeAmplifier implements Amplifier {

    private DiskPlayer diskPlayer;
    private int volumeLevel;

    @Override
    public void on() {
        System.out.println("amplifier on");
    }

    @Override
    public void setSurroundSoundOn() {
        System.out.println("surround on");
    }

    @Override
    public void setSurroundSoundOff() {
        System.out.println("surround off");
    }

    @Override
    public void setDiskPlayer(DiskPlayer diskPlayer) {
        this.diskPlayer = diskPlayer;
    }

    @Override
    public void setVolume(int level) {
        this.volumeLevel = level;
        System.out.println("volume set to " + level);
    }

    @Override
    public void off() {
        System.out.println("amplifier off");
    }
}
