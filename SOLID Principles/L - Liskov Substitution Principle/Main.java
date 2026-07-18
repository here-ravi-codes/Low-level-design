public class Main {
    public static void main(String[] args) {
        Motorbike motorbike = new Motorbike();
        Bicycle bicycle = new Bicycle();
        motorbike.accelerate();
        motorbike.brake();
        motorbike.turnOnEngine();
        motorbike.turnOffEngine();
        bicycle.accelerate();
        bicycle.brake();
    }
}
