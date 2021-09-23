package com.company;

public class Camera2 extends Camera{

    public Camera2() {
        super(new doNightShoot(), new noTimeLapse(), new noSlowMotion());
    }

    public void camera() {
        System.out.println("Camera number two");
    }

}
