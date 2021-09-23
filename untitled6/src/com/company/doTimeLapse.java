package com.company;

public class doTimeLapse implements timeLapseStrategy{
    @Override
    public void timeLapse() {
        System.out.println("This camera can do time lapse videos");
    }
}
