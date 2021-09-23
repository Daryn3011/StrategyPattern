package com.company;

public class Camera1 extends Camera{

    public Camera1() {
        super(new doNightShoot(), new doTimeLapse(), new doSlowMotion());
    }

    public void camera() {
        System.out.println("Camera number one");
    }
}
