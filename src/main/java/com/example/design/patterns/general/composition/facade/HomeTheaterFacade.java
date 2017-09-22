package com.example.design.patterns.general.composition.facade;

import com.example.design.patterns.general.composition.facade.theatre.*;
import com.example.design.patterns.general.composition.facade.theatre.impl.CdPlayer;
import com.example.design.patterns.general.composition.facade.theatre.impl.DvdPlayer;

public class HomeTheaterFacade {

    private Amplifier amplifier;
    private Tuner tuner;
    private DvdPlayer dvdPlayer;
    private CdPlayer cdPlayer;
    private Projector projector;
    private Lights lights;
    private Screen screen;
    private PopcornPopper popcornPopper;

    public HomeTheaterFacade(final Amplifier amp, final Tuner tun, final DvdPlayer dvd,
                             final CdPlayer cd, final Projector projector, final Screen screen,
                             final Lights lights, final PopcornPopper popper) {
        this.amplifier = amp;
        this.tuner = tun;
        this.dvdPlayer = dvd;
        this.cdPlayer = cd;
        this.projector = projector;
        this.screen = screen;
        this.lights = lights;
        this.popcornPopper = popper;
    }

    public void watchMovie(final String movie) {
        System.out.println("Starting " + movie + " playback");

        popcornPopper.on();
        popcornPopper.pop();

        lights.on();
        lights.dim(10);

        screen.down();

        projector.on();
        projector.wideScreenMode();

        dvdPlayer.on();

        amplifier.on();
        amplifier.setDiskPlayer(dvdPlayer);
        amplifier.setSurroundSoundOn();
        amplifier.setVolume(5);

        dvdPlayer.play(movie);
    }

    public void endMovie() {
        System.out.println("Ending movie playback");
        popcornPopper.off();
        lights.off();
        projector.off();
        screen.up();
        amplifier.off();
        dvdPlayer.stop();
        dvdPlayer.eject();
        dvdPlayer.off();
    }

}
