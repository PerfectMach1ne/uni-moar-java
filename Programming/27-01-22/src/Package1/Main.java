package Package1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        Scanner sc = new Scanner(System.in);
        int[] intArray = {1,4,9,16,25,36,49,64,81,100};

        int scannedInt = sc.nextInt();
        System.out.println(scannedInt);

        boolean isInArray = false;
        for (int integer : intArray) {
            if (integer == scannedInt)
                isInArray = true;
        }

        if (!isInArray)
            throw new IllegalAccessException("Liczby nie ma w tablicy!");
    }
}
