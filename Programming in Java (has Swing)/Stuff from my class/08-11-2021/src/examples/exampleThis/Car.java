package examples.exampleThis;

public class Car {
    String color;
    String type;
    int serialNumber;
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

    public Car(String color) {

    }

    void printDescription() {
        System.out.println("This is " + color + " " + type);
    }
}
