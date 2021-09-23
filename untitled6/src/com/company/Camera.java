package com.company;
public abstract class Camera {
    nightShootStrategy NightShootStrategy;
    timeLapseStrategy TimeLapseStrategy;
    slowMotionStrategy SlowMotionStrategy;

    public Camera(nightShootStrategy nightShootStrategy, timeLapseStrategy timeLapseStrategy, slowMotionStrategy slowMotionStrategy){
        this.TimeLapseStrategy = timeLapseStrategy;
        this.NightShootStrategy = nightShootStrategy;
        this.SlowMotionStrategy = slowMotionStrategy;
    }

    public abstract void camera();

    public void PerformRecord(){
        NightShootStrategy.nightShoot();
    }
    public void PerformTimeLapse(){
        TimeLapseStrategy.timeLapse();
    }
    public void PerformSlowMotion(){
        SlowMotionStrategy.slowMotion();
    }

    public void setVideoStrategy(nightShootStrategy nightShootStrategy) {
        this.NightShootStrategy = nightShootStrategy;
    }
    public void setTimeLapseStrategy(timeLapseStrategy timeLapseStrategy){
        this.TimeLapseStrategy = timeLapseStrategy;
    }

    public void setSlowMotionStrategy(slowMotionStrategy slowMotionStrategy) {
        this.SlowMotionStrategy = slowMotionStrategy;
    }
}
