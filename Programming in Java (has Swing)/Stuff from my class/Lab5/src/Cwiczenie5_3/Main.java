package Cwiczenie5_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader buffRead = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Input your new name: ");
        String name = buffRead.readLine();
        System.out.println("Your name is " + name);
    }
}
