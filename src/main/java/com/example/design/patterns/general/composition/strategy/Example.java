package com.example.design.patterns.general.composition.strategy;

import com.example.design.patterns.general.composition.strategy.behaviour.fly.impl.FlyRocketPowered;
import com.example.design.patterns.general.composition.strategy.duck.Duck;
import com.example.design.patterns.general.composition.strategy.duck.ModelDuck;

/**
 * Represent strategy pattern implementation with
 * optional delegate swap in runtime
 */

class Example {

    public static void main(String[] args) {
        Duck model = new ModelDuck();
        model.performQuack();
        model.performFly();
        model.setFlyBehaviour(new FlyRocketPowered());
        model.performFly();
    }

}

