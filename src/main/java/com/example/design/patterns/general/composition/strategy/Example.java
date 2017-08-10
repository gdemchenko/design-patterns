package com.example.design.patterns.general.composition.strategy;

import com.example.design.patterns.general.composition.strategy.duck.Duck;
import com.example.design.patterns.general.composition.strategy.duck.MallardDuck;
import com.example.design.patterns.general.composition.strategy.duck.ModelDuck;

/**
 * Represent strategy pattern implementation
 * with default interface implementations introduced in java8
 */

class Example {

    public static void main(String[] args) {
        Duck model = new ModelDuck();
        model.quack();
        model.fly();

        Duck mallard = new MallardDuck();
        mallard.quack();
        mallard.fly();
    }

}

