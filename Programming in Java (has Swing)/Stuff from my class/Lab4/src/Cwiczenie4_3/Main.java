package Cwiczenie4_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String password = sc.nextLine();
        boolean hasOneLetter = false;
        boolean isAlphaNumeric = true;
        boolean hasOneNumber = false;
        boolean hasTwoNumbers = false;
        for (int i = 0; i < password.length(); i++) {
            if ( Character.isLetter( password.charAt(i) ) ) {
                if (!hasOneLetter) hasOneLetter = true;
            } else if ( Character.isDigit( password.charAt(i) ) ) {
                if (!hasOneNumber) hasOneNumber = true;
                else if (!hasTwoNumbers) hasTwoNumbers = true;
            } else {    // Both isLetter and isDigit return false -> is not alphanumeric
                if (isAlphaNumeric) isAlphaNumeric = false;
            }
        }

        System.out.println("Ocena bezpieczeństwa hasła: ");
        System.out.println(hasOneLetter ? "Hasło posiada conajmniej 1 literę" : "Hasło nie zawiera liter");
        System.out.println(isAlphaNumeric ? "Hasło składa się tylko z liter i cyfr" : "Hasło zawiera znaki specjalne");
        System.out.println(hasTwoNumbers ? "Hasło zawiera conajmniej 2 cyfry" : "Hasło zawiera mniej niż 2 cyfry");

        sc.close();
    }
}
