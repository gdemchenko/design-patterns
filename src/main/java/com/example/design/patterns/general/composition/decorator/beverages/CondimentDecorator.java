package com.example.design.patterns.general.composition.decorator.beverages;

public abstract class CondimentDecorator extends Beverage {

    protected Beverage beverage;

    public abstract String getDescription();

}
