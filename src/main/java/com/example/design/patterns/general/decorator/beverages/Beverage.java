package com.example.design.patterns.general.decorator.beverages;

public abstract class Beverage {

    protected String description = "Unknown beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
