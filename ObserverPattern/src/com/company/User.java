package com.company;
import java.util.List;
public class User implements Observer{
    private String login;
    public User(String login){
        this.login = login;
    }
    public void update(List<String> cars){
        System.out.println("Good day, " + login + "\nWe have some changes in our list of cars:\n" + cars);
    }
}
