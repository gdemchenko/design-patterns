package com.example.design.patterns.general.factory;

import com.example.design.patterns.general.factory.pizza.impl.CheesePizza;
import com.example.design.patterns.general.factory.pizza.impl.ClamPizza;
import com.example.design.patterns.general.factory.pizza.impl.PepperoniPizza;
import com.example.design.patterns.general.factory.pizza.impl.VeggiePizza;
import com.example.design.patterns.general.factory.pizza.Pizza;

public class SimplePizzaFactory {

    public Pizza createPizza(final String pizzaType) {

        Pizza p = null;

        switch (pizzaType) {
            case "cheese":
                p = new CheesePizza();
                break;
            case "pepperoni":
                p = new PepperoniPizza();
                break;
            case "clam":
                p = new ClamPizza();
                break;
            case "veggie":
                p = new VeggiePizza();
                break;
        }
        return p;
    }

}
