package com.asgarov.patterns.facade;

public class RobotBody {

    public static void createRobot() {
        System.out.println("Refer the manual before creation of a robot.");
    }

    public void createHands() {
        System.out.println("Hands manufactured.");
    }

    public void createRemainingParts() {
        System.out.println("Remaining parts (other than hands) are created.");
    }

    public static void destroyRobot() {
        System.out.println("Refere the manual before destroying of a robot");
    }

    public void destroyHands() {
        System.out.println("The robots hands are destroyed");
    }

    public void destroyRemainingParts() {
        System.out.println("The robot's remaining parts are destroyed.");
    }
}
