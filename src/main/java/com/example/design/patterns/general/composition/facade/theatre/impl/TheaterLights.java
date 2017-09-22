package com.example.design.patterns.general.composition.facade.theatre.impl;

import com.example.design.patterns.general.composition.facade.theatre.Lights;

public class TheaterLights implements Lights {
    @Override
    public void on() {
        System.out.println("theater lights on");
    }

    @Override
    public void dim(int ratio) {
        System.out.println("theater lights dimmed to " + ratio + "%");
    }

    @Override
    public void off() {
        System.out.println("theater lights off");
    }
}
