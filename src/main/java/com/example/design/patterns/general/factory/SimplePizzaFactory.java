package com.example.design.patterns.general.factory;

import com.example.design.patterns.general.factory.impl.NYPizzaIngridientFactory;
import com.example.design.patterns.general.factory.pizza.impl.CheesePizza;
import com.example.design.patterns.general.factory.pizza.impl.ClamPizza;
import com.example.design.patterns.general.factory.pizza.impl.PepperoniPizza;
import com.example.design.patterns.general.factory.pizza.impl.VeggiePizza;
import com.example.design.patterns.general.factory.pizza.Pizza;

public class SimplePizzaFactory {

    PizzaIngridientFactory pizzaIngridientFactory = new NYPizzaIngridientFactory();

    public Pizza createPizza(final String pizzaType) {

        Pizza p = null;

        switch (pizzaType) {
            case "cheese":
                p = new CheesePizza(pizzaIngridientFactory);
                break;
            case "pepperoni":
                p = new PepperoniPizza(pizzaIngridientFactory);
                break;
            case "clam":
                p = new ClamPizza(pizzaIngridientFactory);
                break;
            case "veggie":
                p = new VeggiePizza(pizzaIngridientFactory);
                break;
        }
        return p;
    }

}
