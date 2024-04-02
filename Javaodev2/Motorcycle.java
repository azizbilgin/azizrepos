package odev;

public class Motorcycle extends Vehicle {
    public Motorcycle(String brand, String model, int year) {
        super(brand, model, year);
    }
//

    @Override
    public void start() {
        super.start();
        System.out.println("Motorcycle is satrt");
    }

    @Override
    public void stop() {
        super.stop();
        System.out.println("Motorcycle is stop");
    }


    @Override
    public void drive() {

    }
}