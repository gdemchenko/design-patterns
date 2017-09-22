package com.example.design.patterns.general.composition.adapter.duck.impl;

import com.example.design.patterns.general.composition.adapter.duck.Duck;

public class MallardDuck implements Duck {

    @Override
    public void quack() {
        System.out.println("imma mallard duck");
    }

    @Override
    public void fly() {
        System.out.println("imma flying mallard duck");
    }
}
