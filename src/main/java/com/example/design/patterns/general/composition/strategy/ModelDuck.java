package com.example.design.patterns.general.composition.strategy;

import com.example.design.patterns.general.composition.strategy.behaviour.fly.impl.DontFly;
import com.example.design.patterns.general.composition.strategy.behaviour.quack.impl.MutedQuack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehaviour = new DontFly();
        quackBehaviour = new MutedQuack();
    }

    public void display() {
        System.out.println("imma model duck!");
    }
}
