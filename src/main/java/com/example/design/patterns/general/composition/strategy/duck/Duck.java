package com.example.design.patterns.general.composition.strategy.duck;

import com.example.design.patterns.general.composition.strategy.behaviour.fly.Flyable;
import com.example.design.patterns.general.composition.strategy.behaviour.quack.Quackable;

public abstract class Duck implements Flyable, Quackable {

    public void swim() {
        System.out.println("all ducks can swim");
    }

    public abstract  void display();

}