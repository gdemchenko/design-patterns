package com.example.design.patterns.general.composition.decorator.beverages;

public class HouseBlend extends Beverage {

    public HouseBlend(){
        description = "House Blend Coffee";
    }

    public double cost() {
        return .89;
    }

}