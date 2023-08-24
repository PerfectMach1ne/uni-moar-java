package Cwiczenie8_1;

import java.util.Scanner;

public class Cwiczenie8_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String sentence = sc.nextLine();
        System.out.println("Zdanie: " + sentence);
        // Konwersja String-a do tablicy char-ów
        char[] sentenceArrayForm = sentence.toCharArray();
        // Inicjalizacja tablicy dla odwróconego zdania (bo inaczej wywala błąd xd)
        char[] sentenceArrayReversed = new char[sentenceArrayForm.length];
        // Odwracanie zdania
        for (int i = 0; i < sentenceArrayForm.length; i++) {
            sentenceArrayReversed[i] = sentenceArrayForm[sentenceArrayForm.length - 1 - i];
        }

        System.out.println("Zdanie odwrócone: ");
        for (int i = 0; i < sentence.length(); i++) {
            System.out.printf("%c", sentenceArrayReversed[i]);
        }

        sc.close();
    }
}
