package com.company;

public class Main {

    public static void main(String[] args) {
        Camera camera = new Camera1();
        camera.camera();
        camera.PerformRecord();
        camera.PerformSlowMotion();
        camera.PerformTimeLapse();

        Camera camera2 = new Camera2();
        camera2.camera();
        camera2.PerformRecord();
        camera2.PerformSlowMotion();
        camera2.PerformTimeLapse();
        camera2.setTimeLapseStrategy(new doTimeLapse());
        camera2.PerformTimeLapse();
        camera2.setVideoStrategy(new noNightShoot());
        camera2.setSlowMotionStrategy(new doSlowMotion());
    }
}
