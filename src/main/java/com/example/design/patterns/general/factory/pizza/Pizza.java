package com.example.design.patterns.general.factory.pizza;

import com.example.design.patterns.general.factory.ingridient.*;

public abstract class Pizza {

    protected String name;
    protected Dough dough;
    protected Sauce sauce;
    protected Veggies[] veggies;
    protected Cheese cheese;
    protected Pepperoni pepperoni;
    protected Clams clams;

    public abstract void prepare(); /*{
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough " + dough.getClass().getName());
        System.out.println("Adding sauce " + sauce.getClass().getName());
        System.out.println("Adding veggies");
        for (Object vegg : veggies) {
            System.out.println(vegg.getClass().getName());
        }
    }*/

    public void bake() {
        System.out.println("Bake for 25 min at 350");
    }

    public void cut() {
        System.out.println("Cutting to slices");
    }

    public void box() {
        System.out.println("Placing in offical box");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
