package com.example.design.patterns.general.composition.strategy.behaviour.quack;

public interface Quacks extends Quackable {

    default void quack() {
        System.out.println("quack");
    }

}
