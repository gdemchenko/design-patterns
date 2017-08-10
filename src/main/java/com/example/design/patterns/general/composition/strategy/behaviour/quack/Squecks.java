package com.example.design.patterns.general.composition.strategy.behaviour.quack;

public interface Squecks extends Quackable {

    default void quack() {
        System.out.println("squeck");
    }

}
