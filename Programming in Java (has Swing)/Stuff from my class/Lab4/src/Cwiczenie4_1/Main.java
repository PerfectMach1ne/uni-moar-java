package Cwiczenie4_1;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car("red", "BMW");
        Car car3 = new Car("silver", "Mazda");
        Car car4 = new Car("black", "Volvo");

        car1.printDescription();
        car2.printDescription();
        car3.printDescription();
        car4.printDescription();

        carCount();
        new Car();
        carCount();
    }

    public static void carCount() {
        System.out.println("Liczba samochodów: " + Car.carCount);
    }
}
