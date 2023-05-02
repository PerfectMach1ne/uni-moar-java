package pack1;

import java.util.Scanner;

public class Odliczanie {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;

        System.out.println("Podaj (dodatnią!) liczbę: ");
        number = sc.nextInt();

        for (int counter = 1; counter < number; counter++) {
            System.out.println("Do zakończenia programu pozostało " + (number - counter) + " instrukcji");
        }

        System.out.println("Do zakończenia programu pozostało... 0 instrukcji");
    }
}
