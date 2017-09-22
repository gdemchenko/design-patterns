package com.example.design.patterns.general.composition.decorator.beverages;

public class Mocha extends CondimentDecorator {

    public Mocha(final Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    public double cost() {
        return .20 + beverage.cost();
    }
}
