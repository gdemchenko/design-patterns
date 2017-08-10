package com.example.design.patterns.general.composition.strategy.behaviour.quack.impl;

import com.example.design.patterns.general.composition.strategy.behaviour.quack.QuackBehaviour;

public class MutedQuack implements QuackBehaviour {

    public void quack() {
        System.out.println("mah cant quack");
    }

}
