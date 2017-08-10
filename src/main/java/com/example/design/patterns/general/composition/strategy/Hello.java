package com.example.design.patterns.general.composition.strategy;

import com.example.design.patterns.general.composition.strategy.behaviour.fly.impl.FlyRocketPowered;

class Hello {

    public static void main(String[] args) {
        Duck model = new ModelDuck();
        model.performQuack();
        model.performFly();
        model.setFlyBehaviour(new FlyRocketPowered());
        model.performFly();
    }

}

