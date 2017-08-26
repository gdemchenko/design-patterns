package com.example.design.patterns.general.observer.builtin.observer;

import com.example.design.patterns.general.observer.builtin.subject.WeaterData;
import com.example.design.patterns.general.observer.DisplayElement;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private float pressure;
    private Observable weatherData;

    public CurrentConditionsDisplay(Observable weatherData) {
        this.weatherData = weatherData;
        weatherData.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + "C degrees\n" +
                        "\t\t\t\t\t" + humidity + " humidity\n" +
                "\t\t\t\tand " + pressure + "kPa pressure");
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeaterData) {
            WeaterData wd = (WeaterData) o;
            this.temperature = wd.getTemperature();
            this.humidity = wd.getHumidity();
            this.pressure = wd.getPressure();
            display();
        }
    }

}
