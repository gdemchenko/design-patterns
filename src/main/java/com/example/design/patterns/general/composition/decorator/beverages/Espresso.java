package com.example.design.patterns.general.composition.decorator.beverages;

public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    public double cost() {
        return 1.99;
    }

}
