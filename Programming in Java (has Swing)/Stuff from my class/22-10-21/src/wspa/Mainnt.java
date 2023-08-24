package wspa;

import java.time.Instant;
import java.time.ZoneId;
import java.util.Scanner;
import java.time.Clock;

public class Mainnt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Clock clock = Clock.systemDefaultZone();
        long ms = clock.millis();

        System.out.println("Hello world!!");
        System.out.println("Data systemu operacyjnego w ms: " + ms);
        System.out.println("Podaj liczbe a:");
        int a = sc.nextInt();
        System.out.println("Podaj liczbe b:");
        int b = sc.nextInt();

        System.out.println(a + " + " + b + " = " + (a+b));
        if (a > b) System.out.println("Liczba " + a + " jest wieksza.");
        else if (b > a) System.out.println("Liczba " + b + " jest wieksza.");
        else System.out.println("Liczby a i b sa sobie rowne.");

        sc.close();
    }
}
