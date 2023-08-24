package w5.w6.oog;

import java.util.Scanner;

public class While2 {
    private static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);

        int value = 0;
        do {
            System.out.println("Enter a number:");
            value = scanner.nextInt();
        } while (value != 5);
        System.out.println("Got 5!");

        scanner.close();
    }
}
