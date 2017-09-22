package com.example.design.patterns.general.composition.facade.theatre.impl;

import com.example.design.patterns.general.composition.facade.theatre.PopcornPopper;

public class HomePopper implements PopcornPopper {
    @Override
    public void on() {
        System.out.println("popcorn popper on");
    }

    @Override
    public void pop() {
        System.out.println("now popping corn");
    }

    @Override
    public void off() {
        System.out.println("popcorn popper off");
    }
}
