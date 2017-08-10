package com.example.design.patterns.general.composition.strategy.behaviour.fly.impl;

import com.example.design.patterns.general.composition.strategy.behaviour.fly.FlyBehaviour;

public class FlyRocketPowered implements FlyBehaviour {

    public void fly() {
        System.out.println("imma rocket flying");
    }

}
