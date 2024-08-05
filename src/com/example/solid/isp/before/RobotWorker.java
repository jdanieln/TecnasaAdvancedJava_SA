package com.example.solid.isp.before;

public class RobotWorker implements Worker {
    @Override
    public void work() {
        System.out.println("Robot worker is working");
    }

    // No tiene sentido que un robot "coma", pero la interfaz lo obliga
    @Override
    public void eat() {
        throw new UnsupportedOperationException("Robot worker does not eat");
    }
}
