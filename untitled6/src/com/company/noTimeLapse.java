package com.company;

public class noTimeLapse implements timeLapseStrategy{
    @Override
    public void timeLapse() {
        System.out.println("This camera can not do time lapse videos");
    }
}
