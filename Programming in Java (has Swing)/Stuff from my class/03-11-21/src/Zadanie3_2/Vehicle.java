package Zadanie3_2;

public class Vehicle {
    int wheelSize;
    String manufacturer;
    String color;
    String model;

    public Vehicle() { }

    public void start() {
        System.out.println("Start!");
    }

    public void crash() { }

    public String stop() {
        System.out.println("Stop!");
        return null;
    }

    public void driveFaster() {
        System.out.println("Drive faster please.");
    }

    public void driveSlower() {
        System.out.println("Drive slower please.");
    }

    public int getWheelSize() {
        return wheelSize;
    }

    public void setWheelSize(int wheelSize) {
        this.wheelSize = wheelSize;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
