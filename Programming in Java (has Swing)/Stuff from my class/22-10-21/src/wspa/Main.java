package wspa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Hello world!!");
        System.out.println("Podaj imie:");
        String imie = sc.next();
        System.out.println("Podaj nazwisko");
        String nazwisko = sc.next();

        System.out.println("Witaj " + imie + " " + nazwisko);

        sc.close();
    }
}
