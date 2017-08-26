package com.example.design.patterns.general.composition.strategy.duck;

import com.example.design.patterns.general.composition.strategy.behaviour.fly.impl.FlyWithWings;
import com.example.design.patterns.general.composition.strategy.behaviour.quack.impl.Quack;

public class MallardDuck extends Duck {
  
  public MallardDuck() {
    quackBehaviour = new Quack();
    flyBehaviour = new FlyWithWings();
  }

  public void display() {
    System.out.println("imma mallard duck!");
  }

}

