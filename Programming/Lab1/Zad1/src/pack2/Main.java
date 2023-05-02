package pack2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer firstNumber, secondNumber;

        System.out.println("Podaj pierwszą liczbę: ");
        firstNumber = sc.nextInt();
        System.out.println("Podaj drugą liczbę: ");
        secondNumber = sc.nextInt();

        if (firstNumber.compareTo(secondNumber) > 0) {
            System.out.println("Pierwsza liczba jest większa od drugiej liczby.");
        } else if (firstNumber.compareTo(secondNumber) < 0) {
            System.out.println("Pierwsza liczba jest mniejsza od drugiej liczby.");
        } else {
            System.out.println("Obie liczby są sobie równe.");
        }

        if (firstNumber % 2 == 0 && secondNumber % 2 == 0) {
            System.out.println("Obie liczby są parzyste.");
        } else if (firstNumber % 2 == 1 && secondNumber % 2 == 0) {
            System.out.println("Pierwsza liczba jest nieparzysta a druga parzysta.");
        } else if (firstNumber % 2 == 0 && secondNumber % 2 == 1) {
            System.out.println("Pierwsza liczba jest parzysta a druga nieparzysta.");
        } else {
            System.out.println("Obie liczby są nieparzyste.");
        }

        System.out.println(firstNumber + " + " + secondNumber + " = " + (firstNumber + secondNumber));
        System.out.println(firstNumber + " - " + secondNumber + " = " + (firstNumber - secondNumber));
        System.out.println(firstNumber + " * " + secondNumber + " = " + (firstNumber * secondNumber));
        if (secondNumber != 0) {
            System.out.println(firstNumber + " / " + secondNumber + " = " + (firstNumber / secondNumber));
        } else {
            System.out.println("Nie można dzielić przez zero!");
        }

        DecToBinConverter dtbc = new DecToBinConverter();
        System.out.println("Binarna postać pierwszej liczby: " + dtbc.toBinaryString(firstNumber));
        System.out.println("Binarna postać drugiej liczby: " + Integer.toBinaryString(secondNumber));
    }
}
