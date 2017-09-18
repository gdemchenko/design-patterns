package com.example.design.patterns.general.observer.builtin.subject;

import java.util.Observable;

public class WeaterData extends Observable {

    private float temperature;
    private float humidity;
    private float pressure;


    public WeaterData() {

    }

    public void measurementsChanged() {
        setChanged();
        notifyObservers();
    }

    public void setMeasurements(final float temperature, final float humidity, final float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
