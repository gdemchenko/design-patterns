package com.example.design.patterns.general.command.receiver;

public class Light {

    private String location;

    public Light(final String location) {
        this.location = location;
    }

    public void on() {
        System.out.println(location + "lights on");
    }

    public void off() {
        System.out.println(location + " lights off");
    }

}
