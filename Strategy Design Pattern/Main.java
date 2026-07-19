import Vehicles.*;

public class Main{
    public static void main(String[] args){
        Vehicle v1 = new PassengerVehicle();
        v1.drive();
        Vehicle v2 = new SportsVehicle();
        v2.drive();
        Vehicle v3 = new GoodsVehicle();
        v3.drive();
        Vehicle v4 = new OffRoadVehicles();
        v4.drive();
    }
}
