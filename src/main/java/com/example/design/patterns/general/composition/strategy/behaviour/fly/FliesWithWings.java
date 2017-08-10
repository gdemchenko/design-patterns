package com.example.design.patterns.general.composition.strategy.behaviour.fly;

public interface FliesWithWings extends Flyable {

  default void fly() {
    System.out.println("imma flying!"); 
  }

}

