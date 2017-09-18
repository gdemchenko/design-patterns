package com.example.design.patterns.general.factory;

import com.example.design.patterns.general.factory.ingridient.*;

public interface PizzaIngridientFactory {

    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
    Veggies[] createVeggies();
    Pepperoni createPepperoni();
    Clams createClams();

}
