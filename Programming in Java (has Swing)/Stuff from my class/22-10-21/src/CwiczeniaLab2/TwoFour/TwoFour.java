package CwiczeniaLab2.TwoFour;

import java.util.Scanner;

public class TwoFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj swoje imie: ");
        String name = sc.next();

        System.out.println("Witaj " + name + "!");

        sc.close();
    }
}
