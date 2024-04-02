package odev;

public class Main {
    public static void main(String[] args) {

        Car car = new Car("Toyota", "Corolla", 2015);
        Motorcycle motorcycle = new Motorcycle("Honda", "CBR600RR", 2018);
        Truck truck = new Truck("Ford", "F-150", 2020);

        // Calling properties and behaviors
        System.out.println("Car Brand: " + car.getBrand());
        System.out.println("Car Model: " + car.getModel());
        System.out.println("Car Year: " + car.getYear());
        car.start();
        car.drive();
        car.stop();

        System.out.println("\nMotorcycle Brand: " + motorcycle.getBrand());
        System.out.println("Motorcycle Model: " + motorcycle.getModel());
        System.out.println("Motorcycle Year: " + motorcycle.getYear());
        motorcycle.start();
        motorcycle.drive();
        motorcycle.stop();

        System.out.println("\nTruck Brand: " + truck.getBrand());
        System.out.println("Truck Model: " + truck.getModel());
        System.out.println("Truck Year: " + truck.getYear());
        truck.start();
        truck.drive();
        truck.stop();
    }
}