package com.example.design.patterns.general.composition.strategy.behaviour.quack.impl;

import com.example.design.patterns.general.composition.strategy.behaviour.quack.QuackBehaviour;

public class Quack implements QuackBehaviour {

    public void quack() {
        System.out.println("quack");
    }

}
