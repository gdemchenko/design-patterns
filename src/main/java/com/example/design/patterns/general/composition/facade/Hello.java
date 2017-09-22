package com.example.design.patterns.general.composition.facade;

import com.example.design.patterns.general.composition.facade.theatre.TheaterProjector;
import com.example.design.patterns.general.composition.facade.theatre.impl.*;

public class Hello {

    public static void main(String[] args) {

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(new HomeAmplifier(), new HomeTuner(),
                new DvdPlayer(), new CdPlayer(), new TheaterProjector(), new WallScreen(),
                new TheaterLights(), new HomePopper());

        homeTheater.watchMovie("8 mile");
        homeTheater.endMovie();

    }

}
