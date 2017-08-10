package com.example.design.patterns.general.composition.strategy;

import com.example.design.patterns.general.composition.strategy.behaviour.fly.FliesWithWings;
import com.example.design.patterns.general.composition.strategy.behaviour.quack.Quacks;

public class MallardDuck extends Duck implements FliesWithWings, Quacks {
  
  public void display() {
    System.out.println("imma mallard duck!");
  }

}

