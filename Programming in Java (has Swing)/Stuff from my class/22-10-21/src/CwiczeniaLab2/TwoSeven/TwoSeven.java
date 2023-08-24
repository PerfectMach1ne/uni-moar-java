package CwiczeniaLab2.TwoSeven;

import java.util.Scanner;

public class TwoSeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj pierwsza liczbe: ");
        double a = sc.nextDouble();
        System.out.println("Podaj druga liczbe: ");
        double b = sc.nextDouble();

        if (a > b) {
            System.out.println(a + " jest wieksze od " + b);
        } else if (a < b) {
            System.out.println(a + " jest mniejsze od " + b);
        } else {
            System.out.println(a + " jest rowne " + b);
        }

        sc.close();
    }
}
