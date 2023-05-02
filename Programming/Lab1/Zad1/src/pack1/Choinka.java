package pack1;

import java.util.Scanner;

public class Choinka {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        int branchHeight, branchCount;
//
//        System.out.println("Podaj wysokość gałązek: ");
//        branchHeight = sc.nextInt();
//        System.out.println("Podaj ilość gałązek");
//        branchCount = sc.nextInt();
//
//        for(int i = 1; i < branchCount; i++) {
//            for(int j = 1; j < branchHeight; j++) {
//                for(k = )
//            }
//        }
        int liczbaGalazek = 4;
        int wysokoscGalazki = 3;
        int szerokoscGalazki = 1 + ((wysokoscGalazki - 1) * 2);
        int srodek = szerokoscGalazki / 2;

        while (liczbaGalazek > 0) {
            for (int wiersz = 0; wiersz < wysokoscGalazki; wiersz++) {
                for (int kolumna = 0; kolumna < szerokoscGalazki; kolumna++) {
                    if ((kolumna >= srodek - wiersz) && (kolumna <= srodek + wiersz))
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
                System.out.println();
            }
            liczbaGalazek--;
        }

        int szerokoscPnia;
        if (szerokoscGalazki > 3) {
            szerokoscPnia = 1;
        } else if (szerokoscGalazki % 2 == 0) {
            szerokoscPnia = 2;
        } else {
            szerokoscPnia = 3;
        }

//        for (int wiersz = 0; wiersz < )

        sc.close();
    }
}
