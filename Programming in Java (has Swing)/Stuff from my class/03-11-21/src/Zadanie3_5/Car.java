package Zadanie3_5;

import java.sql.SQLOutput;

public class Car {
    String color;
    String type;

    Car() {}

    Car(String color, String type) {
        this.color = color;
        this.type = type;
    }

    String getDescription() {
        return "This is " + color + " " + type;
    }

    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.color = "pink";
        myCar.type = "Suzuki";
        System.out.println(myCar.getDescription());
        Car yourCar = new Car("green", "Syrena");
        System.out.println(yourCar.getDescription());

        String c = "abc".substring(2,2);
        String d = "abc".substring(2,3);
        System.out.println(c + '\n' + d);
    }
}
