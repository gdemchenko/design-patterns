package com.example.design.patterns.general.factory.pizza.impl;

import com.example.design.patterns.general.factory.PizzaIngridientFactory;
import com.example.design.patterns.general.factory.pizza.Pizza;

public class PepperoniPizza extends Pizza {

    private PizzaIngridientFactory ingridientFactory;

    public PepperoniPizza(PizzaIngridientFactory ingridientFactory) {
        this.ingridientFactory = ingridientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        dough = ingridientFactory.createDough();
        sauce =  ingridientFactory.createSauce();
        pepperoni = ingridientFactory.createPepperoni();
    }

}
