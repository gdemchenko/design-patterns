package com.example.design.patterns.general.composition.strategy.duck;

import com.example.design.patterns.general.composition.strategy.behaviour.fly.DoesntFly;
import com.example.design.patterns.general.composition.strategy.behaviour.quack.DoesntQuack;

public class ModelDuck extends Duck implements DoesntFly, DoesntQuack {

    public void display() {
        System.out.println("imma model duck!");
    }
}
