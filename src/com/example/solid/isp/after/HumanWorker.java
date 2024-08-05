package com.example.solid.isp.after;

public class HumanWorker implements Workable, Eatable {
    @Override
    public void work() {
        System.out.println("Human worker is working");
    }

    @Override
    public void eat() {
        System.out.println("Human worker is eating");
    }
}