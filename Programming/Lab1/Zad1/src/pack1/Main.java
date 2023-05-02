package pack1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double liczbaPunktow;

        System.out.println("Podaj maksymalną liczbę punktów:");
        double maksPunkty = sc.nextDouble();
        do {
            System.out.println("Podaj liczbę punktów ucznia:");
            liczbaPunktow = sc.nextDouble();
        } while (liczbaPunktow > maksPunkty);

        double procent = liczbaPunktow / maksPunkty;

        System.out.print("Ocena za egzamin: ");
        if (procent >= 0.9) System.out.print("bardzo dobry.");
        else if (procent < 0.9 && procent >= 0.8) System.out.print("dobry.");
        else if (procent < 0.8 && procent >= 0.7) System.out.print("dostateczny.");
        else if (procent < 0.7 && procent >= 0.6) System.out.print("dopuszczający.");
        else System.out.println("niedostateczny.");

        sc.close();
    }
}
