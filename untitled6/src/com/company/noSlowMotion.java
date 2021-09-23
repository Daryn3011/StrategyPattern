package com.company;

public class noSlowMotion implements slowMotionStrategy{
    public void slowMotion() {
        System.out.println("Camera can not record a slow motion videos");
    }
}
