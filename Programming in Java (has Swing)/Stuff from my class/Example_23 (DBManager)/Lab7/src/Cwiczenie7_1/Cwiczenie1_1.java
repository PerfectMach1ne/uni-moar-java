package Cwiczenie7_1;

public class Cwiczenie1_1 {
    public static void main(String[] args) {
        int x = 0;
        do {
            if (x % 2 == 0) {
                System.out.println(x + " is an even number.");
            }
            x++;
        } while (x <= 20);
    }
}
