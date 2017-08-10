package com.example.design.patterns.general.composition.strategy;

class Hello {

    public static void main(String[] args) {
        Duck model = new ModelDuck();
        model.quack();
        model.fly();

        Duck mallard = new MallardDuck();
        mallard.quack();
        mallard.fly();
    }

}

