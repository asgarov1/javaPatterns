package com.asgarov.patterns.facade;

public class Runner {
    public static void main(String[] args) {
        System.out.println("***Facade Pattern Demo***\n");
        //Creating Robots
        var robotFacade = new RobotFacade();
        robotFacade.constructMilanoRobot();
        robotFacade.constructRobonautRobot();
        //Destroying robots
        robotFacade.destroyMilanoRobot();
        robotFacade.destroyRobonautRobot();
    }
}
