package com.example.design.patterns.general.composition.decorator.beverages;

import static java.lang.String.format;

public class Hello {

    public static void main(String[] args) {
        Beverage b = new Espresso();
        String outf = "Beverage: %s%nCost: %s";
        System.out.println(format(outf, b.getDescription(), b.cost()));

        Beverage b2 = new HouseBlend();
        b2 = new Mocha(b2);
        b2 = new Mocha(b2);
        System.out.println(format(outf, b2.getDescription(), b2.cost()));

    }

}
