package Vehicles;

import Strategy.SportsDriveStrategy;

public class OffRoadVehicles extends Vehicle{
    public OffRoadVehicles(){
        super(new SportsDriveStrategy());
    }
}
