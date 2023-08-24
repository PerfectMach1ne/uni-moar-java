package Cwiczenie4_5;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        String[] szufladaA = { "Skarpeta", "Skarpeta", "Skarpeta", "Koszulka", "Koszulka", "Koszulka", "Skarpeta",
                            "Spodnie", "Spodnie", "Sukienka", "Garnitur", "Sukienka", "Skarpeta", "Koszulka" };
        System.out.println("Zawartość szuflady A: ");
        for (int i = 0; i < szufladaA.length; i++) {
            System.out.print(szufladaA[i]);
            if (i < szufladaA.length - 1) System.out.print(", ");
        }
        System.out.println();

        HashMap<SzufladaB, Integer> szufladaB = new HashMap<SzufladaB, Integer>();
        szufladaB.put(SzufladaB.BIELIZNA, 5);
        szufladaB.put(SzufladaB.SKARPETA, 3);
        szufladaB.put(SzufladaB.GARNITUR, 1);
        szufladaB.put(SzufladaB.SUKIENKA, 0);
        szufladaB.put(SzufladaB.KOSZULKA, 17);
        szufladaB.put(SzufladaB.SPODNIE, 8);
        System.out.println("Zawartość szuflady B: ");
        System.out.println(SzufladaB.BIELIZNA + ": " + szufladaB.get(SzufladaB.BIELIZNA));
        System.out.println(SzufladaB.SKARPETA + ": " + szufladaB.get(SzufladaB.SKARPETA));
        System.out.println(SzufladaB.GARNITUR + ": " + szufladaB.get(SzufladaB.GARNITUR));
        System.out.println(SzufladaB.SUKIENKA + ": " + szufladaB.get(SzufladaB.SUKIENKA));
        System.out.println(SzufladaB.KOSZULKA + ": " + szufladaB.get(SzufladaB.KOSZULKA));
        System.out.println(SzufladaB.SPODNIE + ": " + szufladaB.get(SzufladaB.SPODNIE));

        SzufladaC szufladaC = new SzufladaC(5,1,21,7,9,10);
        System.out.println("Zawartość szuflady C: ");
        System.out.println("Skarpety: " + szufladaC.getSkarpetyCount());
        System.out.println("Bielizna: " + szufladaC.getBieliznaCount());
        System.out.println("Sukienki: " + szufladaC.getSukienkaCount());
        System.out.println("Spodnie: " + szufladaC.getSukienkaCount());
        System.out.println("Garnitury: " + szufladaC.getSpodnieCount());
        System.out.println("Koszulki: " + szufladaC.getKoszulkaCount());
    }
}
