package com.example.design.patterns.general.composition.strategy.behaviour.fly;

public interface FliesRocketPowered extends Flyable {

    default void fly() {
        System.out.println("imma rocket flying");
    }

}
