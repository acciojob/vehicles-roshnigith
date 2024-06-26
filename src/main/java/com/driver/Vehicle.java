package com.driver;

public class Vehicle {

    private String name;
    protected int currentSpeed;
    protected int currentDirection;

    public Vehicle(String name) {
            this.name = name;
    }
    public String getName(){
        return name;
    }
    public int getCurrentDirection(){
        return currentDirection;
    }
    public int getCurrentSpeed(){
        return currentSpeed;
    }

    public void steer(int direction){
        //direction is in degrees, add it to the current direction
        System.out.println("steer method called - The direction is changed to: " + currentDirection + " degrees");
    }

    public void move(int speed, int direction){
        //set the values of currentSpeed and currentDirection
        System.out.println("move method called - The speed is changed to: " + currentSpeed + ", and the direction is changed to: " + currentDirection + " degrees");
    }

    public void stop(){

        System.out.println("stop method called - The vehicle is stopped");
    }

}
