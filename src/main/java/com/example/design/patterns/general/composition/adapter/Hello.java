package com.example.design.patterns.general.composition.adapter;

import com.example.design.patterns.general.composition.adapter.duck.Duck;
import com.example.design.patterns.general.composition.adapter.duck.impl.MallardDuck;
import com.example.design.patterns.general.composition.adapter.turkey.TurkeyAdapter;
import com.example.design.patterns.general.composition.adapter.turkey.impl.WildTurkey;

public class Hello {

    public static void main(String[] args) {
        MallardDuck d = new MallardDuck();

        WildTurkey t = new WildTurkey();

        TurkeyAdapter adapter = new TurkeyAdapter(t);

        t.gobble();
        t.fly();

        testDuck(d);

        testDuck(adapter);
    }

    private static void testDuck(final Duck d) {
        d.quack();
        d.fly();
    }

}
