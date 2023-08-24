package CwiczeniaLab2.TwoFive;

import java.util.Scanner;

public class TwoFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj liczbe calkowita: ");
        int integer = sc.nextInt();

        for (int i = 0; i < 10; i++) {
            System.out.println(integer + "x" + (i+1) + " = " + integer*(i+1));
        }

        sc.close();
    }
}
