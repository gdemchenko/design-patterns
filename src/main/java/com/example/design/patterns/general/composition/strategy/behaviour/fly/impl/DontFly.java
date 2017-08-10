package com.example.design.patterns.general.composition.strategy.behaviour.fly.impl;

import com.example.design.patterns.general.composition.strategy.behaviour.fly.FlyBehaviour;

public class DontFly implements FlyBehaviour {

    public void fly() {
        System.out.println("mah cant fly");
    }

}
