package examples.exampleThis2;

public class Car {
    String color;
    String type;
    int serialNumber;
    static int carCount;

    public Car() {
        carCount++;
        serialNumber = carCount;
    }

    public Car(String color, String type) {
        this();
        this.color = color;
        this.type = type;
    }

    void start() {
        System.out.println("Get started!");
    }

    void printDescription() {
        System.out.println("This is " + color + " " + type);
    }
}
