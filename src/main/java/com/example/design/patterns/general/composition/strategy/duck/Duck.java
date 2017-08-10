package com.example.design.patterns.general.composition.strategy.duck;

import com.example.design.patterns.general.composition.strategy.behaviour.quack.QuackBehaviour;
import com.example.design.patterns.general.composition.strategy.behaviour.fly.FlyBehaviour;

public abstract class Duck {

  protected QuackBehaviour quackBehaviour;
  protected FlyBehaviour flyBehaviour;

  public Duck() {}

  public void performQuack() {
    quackBehaviour.quack();
  }

  public void performFly() {
    flyBehaviour.fly();
  }
  
  public void swim() {
    System.out.println("all ducks can swim");
  }

  public abstract  void display();

    public void setQuackBehaviour(final QuackBehaviour qb) {
        this.quackBehaviour = qb;
    }

    public void setFlyBehaviour(final FlyBehaviour fb) {
        this.flyBehaviour = fb;
    }
}


