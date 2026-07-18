public class Motorbike extends Bike implements Engine {
    void accelerate(){
        System.out.println("Motorbike is accelerating.");
    }
    void brake(){
        System.out.println("Motorbike is braking.");
    }
    public void turnOnEngine(){
        System.out.println("Motorbike engine is turned on.");
    }
    
    public void turnOffEngine(){
        System.out.println("Motorbike engine is turned off.");
    }
}

