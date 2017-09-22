package com.example.design.patterns.general.composition.facade.theatre;

public interface Amplifier {

    void on();
    void setSurroundSoundOn();
    void setSurroundSoundOff();
    void setDiskPlayer(final DiskPlayer diskPlayer);
    void setVolume(final int level);
    void off();

}
