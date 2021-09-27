package com.company;
public class Main {
    public static void main(String[] args) {
        CarShowroom showroom = new CarShowroom();
        showroom.addCar("Mercedes");
        showroom.addCar("BMW");
        User user = new User("Yera");
        showroom.register(user);
        showroom.addCar("Mazda");
        showroom.addCar("Honda");
        showroom.removeCar("Mazda");
        User user1 = new User("Beka");
        showroom.register(user1);
        showroom.unregister(user);
        showroom.addCar("Rolls Royce");
    }
}
