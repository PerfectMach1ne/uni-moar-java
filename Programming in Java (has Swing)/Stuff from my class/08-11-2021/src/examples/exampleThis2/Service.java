package examples.exampleThis2;

public class Service {
    public static void main(String[] args) {
        System.out.println(Car.carCount);
        Car car = new Car("green", "convertible");
        car.printDescription();
        car.start();
        System.out.println(Car.carCount);
    }
}
