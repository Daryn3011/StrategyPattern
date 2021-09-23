package com.company;

public class doNightShoot implements nightShootStrategy {
    @Override
    public void nightShoot() {
        System.out.println("This camera can do videos at night");
    }
}
