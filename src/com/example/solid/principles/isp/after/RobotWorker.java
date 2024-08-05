package com.example.solid.principles.isp.after;

public class RobotWorker implements Workable {
    @Override
    public void work() {
        System.out.println("Robot worker is working");
    }
}