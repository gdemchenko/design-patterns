package com.example.design.patterns.general.observer.subject;

import com.example.design.patterns.general.observer.observer.Observer;

public interface Subject {

    void registerObserver(final Observer observer);

    void removeObserver(final Observer observer);

    void notifyObservers();

}
