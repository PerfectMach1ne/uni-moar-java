package CwiczeniaLab2.TwoTwo;

import java.util.Scanner;

public class TwoTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double carVelocity;

        System.out.println("Podaj predkosc samochodu: ");
        carVelocity = sc.nextDouble();
        System.out.println("v = " + carVelocity + "m/s");
        if (carVelocity >= 70) System.out.println("Zbyt szybka predkosc!");
        else if (carVelocity == 0) System.out.println("Samochod stoi w miejscu.");
        else if (carVelocity < 0) System.out.println("Samochod podrozuje w czasie");

        sc.close();
    }
}
