package odev;

public class Truck extends Vehicle {
    public Truck(String brand, String model, int year) {
        super(brand, model, year);
        double cargoCapacity = 5;
    }

    @Override
    public void drive() {

    }

    @Override
    public void start() {
        super.start();
        System.out.println("Truck is satrt");

    }

    @Override
    public void stop() {
        super.stop();
        System.out.println("Truck is stop");
    }
}
