package com.example.design.patterns.general.factory.store;

import com.example.design.patterns.general.factory.pizza.Pizza;

public abstract class PizzaStore {

    public Pizza orderPizza(final String type) {
        Pizza p;

        p = createPizza(type);

        p.prepare();
        p.bake();
        p.cut();
        p.box();

        return p;
    }

    protected abstract Pizza createPizza(final String type);

}
