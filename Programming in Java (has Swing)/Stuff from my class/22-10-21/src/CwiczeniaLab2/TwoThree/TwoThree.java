package CwiczeniaLab2.TwoThree;

import java.util.Scanner;
import java.math.*;

public class TwoThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Mini-kalkulator");
        System.out.println("Podaj pierwsza liczbe a: ");
        double a = sc.nextDouble();
        System.out.println("Podaj druga liczbe b: ");
        double b = sc.nextDouble();

        System.out.println("Wybierz operacje: ");
        System.out.println("1 - Dodawanie (a+b)");
        System.out.println("2 - Odejmowanie (a-b)");
        System.out.println("3 - Mnozenie (a*b)");
        System.out.println("4 - Dzielenie (a/b)");
        System.out.println("5 - Potegowanie (a^b)");
        System.out.println("6 - Pierwiastkowanie (a^(1/b))");
        System.out.println("7 - Logarytmowanie (log_{a}(b))");
        System.out.println("0 - Wyjscie z programu");

        byte choice;
        do {
            switch (choice = sc.nextByte()) {
                case 1:
                    System.out.println("Wybrano dodawanie");
                    System.out.println(a + " + " + b + " = " + (a+b));
                    break;
                case 2:
                    System.out.println("Wybrano odejmowanie");
                    System.out.println(a + " - " + b + " = " + (a-b));
                    break;
                case 3:
                    System.out.println("Wybrano mnozenie");
                    System.out.println(a + " * " + b + " = " + (a*b));
                    break;
                case 4:
                    System.out.println("Wybrano dzielenie");
                    System.out.println(a + " / " + b + " = " + (a/b));
                    break;
                case 5:
                    System.out.println("Wybrano potegowanie");
                    System.out.println(a + "^(" + b + ") = " + Math.pow(a,b));
                    break;
                case 6:
                    System.out.println("Wybrano pierwiastkowanie");
                    System.out.println("(a" + ")√" + b + " = " + Math.pow(a,(1/b)));
                    break;
                case 7:
                    System.out.println("Wybrano logarytmowanie");
                    System.out.println("Logarytm przy podstawie " + a + " z " + b + " = " + (Math.log(b)/Math.log(a)));
                    break;
                case 0:
                    System.out.println("Wybrano wyjscie z programu");
                    break;
                default:
                    System.out.println("Wybierz poprawna opcje!");
            }
            System.out.println(choice);
        } while (choice != 0);

        sc.close();
    }
}
