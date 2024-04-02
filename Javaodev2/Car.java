package odev;

//public class Car extends Vehicle {
public class Car extends Vehicle {
        public Car(String brand, String model, int year) {
            super(brand, model, year);
        }

    @Override
    public void drive() {
        System.out.println("araba hazır");
    }

    // @Override
        //public void drive() {
          //  System.out.println("Driving a car...");
        //}


    @Override
    public void start() {
        super.start();
        System.out.println("car is satrt");
    }

    @Override
    public void stop() {
        super.stop();
        System.out.println("car is stop");
    }
}

