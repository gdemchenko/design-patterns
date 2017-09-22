package com.example.design.patterns.general.composition.facade.theatre;

public interface DiskPlayer {

    void on();
    void play(final String disk);
    void eject();
    void stop();
    void off();

}
