package com.example.design.patterns.general.factory.impl;

import com.example.design.patterns.general.factory.ingridient.*;
import com.example.design.patterns.general.factory.PizzaIngridientFactory;
import com.example.design.patterns.general.factory.ingridient.impl.*;

public class ChicagoPizzaIngridientFactroy implements PizzaIngridientFactory {
    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new Mozzarella();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[] { new Spinach(), new BlackOlives(), new EggPlant() };
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClams() {
        return new FrozenClams();
    }
}
