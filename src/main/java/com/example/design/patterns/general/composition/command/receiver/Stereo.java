package com.example.design.patterns.general.composition.command.receiver;

public class Stereo {

    private String location;

    public Stereo(final String location) {
        this.location = location;
    }

    public void on() {
        System.out.println("stereo on");
    }

    public void off() {
        System.out.println("stereo off");
    }

    public void setCD() {
        System.out.println("cd mode set");
    }

    public void setVolume(final int level) {
        System.out.println("voluem set to level: " + level);
    }

}
