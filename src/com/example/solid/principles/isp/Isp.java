package com.example.solid.principles.isp;

import com.example.solid.principles.isp.after.Eatable;
import com.example.solid.principles.isp.after.HumanWorker;
import com.example.solid.principles.isp.after.RobotWorker;
import com.example.solid.principles.isp.after.Workable;

public class Isp {
    public void run() {
        Workable human = new HumanWorker();
        Workable robot = new RobotWorker();
        Eatable humanEater = new HumanWorker();

        human.work();  // Works fine
        humanEater.eat();  // Works fine

        robot.work();  // Works fine
        // No need to call eat() for robot as it does not implement Eatable
    }
}
