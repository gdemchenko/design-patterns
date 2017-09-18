package com.example.design.patterns.general.observer.builtin;

import com.example.design.patterns.general.observer.builtin.observer.CurrentConditionsDisplay;
import com.example.design.patterns.general.observer.builtin.observer.HeatIndexDisplay;
import com.example.design.patterns.general.observer.builtin.subject.WeaterData;

public class Hello {

    public static void main(String[] args) {
        WeaterData wd = new WeaterData();
        CurrentConditionsDisplay ccd = new CurrentConditionsDisplay(wd);
        HeatIndexDisplay hid = new HeatIndexDisplay(wd);

        wd.setMeasurements(80, 65, 30.4f);
        wd.setMeasurements(80, 65, 30.4f);
        wd.setMeasurements(82, 70, 29.2f);
        wd.setMeasurements(78, 90, 29.6f);
    }

}
