package com.example.design.patterns.general.factory.impl;

import com.example.design.patterns.general.factory.ingridient.*;
import com.example.design.patterns.general.factory.PizzaIngridientFactory;
import com.example.design.patterns.general.factory.ingridient.impl.*;

public class NYPizzaIngridientFactory implements PizzaIngridientFactory {
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new Cheese();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[] { new Garlic(), new Onion(), new Mushroom(), new RedPepper() };
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClams() {
        return new FreshClams();
    }
}
