package Cwiczenie4_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Napisz jakieś zdanie: ");
        String str = sc.nextLine();
        System.out.println("Liczba samogłosek w twoim zdaniu wynosi " + countVovels(str));

        sc.close();
    }

    public static int countVovels(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.toLowerCase().charAt(i) == 'a' || str.toLowerCase().charAt(i) == 'e' ||
                    str.toLowerCase().charAt(i) == 'i' || str.toLowerCase().charAt(i) == 'o' ||
                    str.toLowerCase().charAt(i) == 'u' || str.toLowerCase().charAt(i) == 'ó')
            {
                count++;
            }
        }
        return count;
    }
}
