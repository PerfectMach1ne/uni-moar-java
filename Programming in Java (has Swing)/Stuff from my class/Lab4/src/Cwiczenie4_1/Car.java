package Cwiczenie4_1;

public class Car {
    private String color;
    private String type;
    private final int serialNumber;
    static int carCount;

    public Car() {
        this("green", "convertible");
    }

    public Car(String color, String type) {
        carCount++;
        serialNumber = carCount;
        this.color = color;
        this.type = type;
    }

    public void printDescription() {
        System.out.println("This is a " + color + " " + type + " car.");
        System.out.println("Car serial number: " + serialNumber);
    }
}
