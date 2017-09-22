package com.example.design.patterns.general.composition.adapter.turkey.impl;

import com.example.design.patterns.general.composition.adapter.turkey.Turkey;

public class WildTurkey implements Turkey {

    @Override
    public void gobble() {
        System.out.println("gobble gobble");
    }

    @Override
    public void fly() {
        System.out.println("whoosh");
    }
}
