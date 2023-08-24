package ExampleW4;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MyWriter {
    public static void main(String[] args) {
        File file = new File("test.txt");

        try (BufferedWriter br = new BufferedWriter(new FileWriter(file))) {
            br.write("Ala ma kota.");
            br.newLine();
            br.write("Kot ma myszkę.");
            br.newLine();
            br.write("Myszka ma komputer.");
            System.out.println("Utworzono plik!");
        } catch (IOException s) {
            System.out.println("Nie mozna odczytać pliku. " + file.toString());
        }
    }
}
