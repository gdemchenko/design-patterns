package com.example.design.patterns.general.composition.strategy.behaviour.quack;

public interface DoesntQuack extends Quackable {

    default void quack() {
        System.out.println("mah cant quack");
    }

}
