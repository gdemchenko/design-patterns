package com.example.design.patterns.general.command.receiver;

public class CeilingFan {

    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;

    private String location;
    private int speed;

    public CeilingFan(final String location) {
        this.location = location;
    }

    public void high() {
        printSpeed();
        speed = HIGH;
    }

    public void medium() {
        printSpeed();
        speed = MEDIUM;
    }

    public void low() {
        printSpeed();
        speed = LOW;
    }

    public void off() {
        speed = OFF;
        printSpeed();
        System.out.println(location + " fan off");
    }

    private void printSpeed() {
        System.out.println(location + " fan speed set to: " + speed);
    }

    public int getSpeed() {
        return speed;
    }
}
