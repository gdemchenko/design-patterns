package com.example.design.patterns.general.factory.store.impl;

import com.example.design.patterns.general.factory.PizzaIngridientFactory;
import com.example.design.patterns.general.factory.impl.NYPizzaIngridientFactory;
import com.example.design.patterns.general.factory.pizza.*;
import com.example.design.patterns.general.factory.pizza.impl.CheesePizza;
import com.example.design.patterns.general.factory.pizza.impl.ClamPizza;
import com.example.design.patterns.general.factory.pizza.impl.PepperoniPizza;
import com.example.design.patterns.general.factory.pizza.impl.VeggiePizza;
import com.example.design.patterns.general.factory.store.PizzaStore;

public class NYPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        Pizza p = null;
        PizzaIngridientFactory ingridientFactory = new NYPizzaIngridientFactory();

        if (type.equals("cheese")) {
            p = new CheesePizza(ingridientFactory);
            p.setName("NY Style Cheese Pizza");
        } else if (type.equals("veggie")) {
            p = new VeggiePizza(ingridientFactory);
            p.setName("NY Style Veggie Pizza");
        } else if (type.equals("clam")) {
            p = new ClamPizza(ingridientFactory);
            p.setName("NY Style Clam Pizza");
        } else if (type.equals("pepperoni")) {
            p = new PepperoniPizza(ingridientFactory);
            p.setName("NY Style Pepperoni Pizza");
        }

        return p;
    }
}
