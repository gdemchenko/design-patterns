package com.example.design.patterns.general.composition.strategy.behaviour.fly;

public interface DoesntFly extends Flyable {

    default void fly() {
        System.out.println("mah cant fly");
    }

}
