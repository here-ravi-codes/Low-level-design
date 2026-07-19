package Vehicles;

import Strategy.DriveStrategy;

public class Vehicle{
    private final DriveStrategy driveStrategy;
    public Vehicle(DriveStrategy ob){
        this.driveStrategy = ob;
    }
    public void drive(){
        driveStrategy.drive();
    }
}
