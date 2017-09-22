package com.example.design.patterns.general.composition.facade.theatre;

public class TheaterProjector implements Projector {
    @Override
    public void on() {
        System.out.println("theater projector on");
    }

    @Override
    public void wideScreenMode() {
        System.out.println("wide screen mode enabled");
    }

    @Override
    public void off() {
        System.out.println("theater projector off");
    }
}
