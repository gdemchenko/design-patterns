package com.example.design.patterns.general.observer.headfirst.subject.impl;

import com.example.design.patterns.general.observer.headfirst.observer.Observer;
import com.example.design.patterns.general.observer.headfirst.subject.Subject;

import java.util.ArrayList;
import java.util.List;

public class WeaterData implements Subject {

    private float temperature;
    private float humidity;
    private float pressure;
    private List<Observer> observers;


    public WeaterData() {
        observers = new ArrayList<>();
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(final float temperature, final float humidity, final float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature, humidity, pressure);
        }
    }
}
