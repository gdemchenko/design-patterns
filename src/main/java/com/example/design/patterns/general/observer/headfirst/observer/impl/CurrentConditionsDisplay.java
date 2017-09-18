package com.example.design.patterns.general.observer.headfirst.observer.impl;

import com.example.design.patterns.general.observer.DisplayElement;
import com.example.design.patterns.general.observer.headfirst.observer.Observer;
import com.example.design.patterns.general.observer.headfirst.subject.Subject;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private float pressure;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + "C degrees\n" +
                        "\t\t\t\t\t" + humidity + " humidity\n" +
                "\t\t\t\tand " + pressure + "kPa pressure");
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
}
