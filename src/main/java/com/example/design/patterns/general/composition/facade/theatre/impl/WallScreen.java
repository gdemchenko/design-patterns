package com.example.design.patterns.general.composition.facade.theatre.impl;

import com.example.design.patterns.general.composition.facade.theatre.Screen;

public class WallScreen implements Screen {

    @Override
    public void up() {
        System.out.println("putting screen up");
    }

    @Override
    public void down() {
        System.out.println("putting screen down");
    }
}
