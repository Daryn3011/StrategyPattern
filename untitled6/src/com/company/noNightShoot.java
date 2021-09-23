package com.company;

public class noNightShoot implements nightShootStrategy {
    @Override
    public void nightShoot() {
        System.out.println("This camera can not do videos at night");
    }
}
