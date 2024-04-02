package odev;

public abstract class Vehicle {
    protected String brand;
    protected String model;
    protected int year;

    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public abstract void drive();

    public void start() {
        System.out.println("Vehicle is starting.");
    }

    public void stop() {
        System.out.println("Vehicle is stopping.");
    }
}
