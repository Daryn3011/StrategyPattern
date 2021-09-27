package com.company;

import java.util.ArrayList;
import java.util.List;

public class CarShowroom implements Observable {
    private List<Observer> observers = new ArrayList<>();
    private List<String> cars = new ArrayList<>();

    public void addCar(String car){
        this.cars.add(car);
        notifyAllUsers();
    }
    public void removeCar(String car){
        this.cars.remove(car);
        notifyAllUsers();
    }

    @Override
    public void register(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void unregister(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyAllUsers() {
        for(Observer obsery: this.observers){
            obsery.update(this.cars);
        }
    }
}
