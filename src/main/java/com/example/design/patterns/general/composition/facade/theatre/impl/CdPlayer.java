package com.example.design.patterns.general.composition.facade.theatre.impl;

import com.example.design.patterns.general.composition.facade.theatre.DiskPlayer;

public class CdPlayer implements DiskPlayer {

    private String disk;

    @Override
    public void on() {
        System.out.println("cd player on");
    }

    @Override
    public void play(String disk) {
        this.disk = disk;
        System.out.println("now playing " + disk);
    }

    @Override
    public void eject() {
        System.out.println("ejecting " + disk);
    }

    @Override
    public void stop() {
        System.out.println("now stopping");
    }

    @Override
    public void off() {
        System.out.println("cd player off");
    }
}
