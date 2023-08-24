package w5.w6.ForEach;

public class Search {
    public static void main(String[] args) {
        int nums[] = { 6, 8, 3, 7, 5, 6, 1, 4 };
        int val = 5;
        boolean found = false;

        // Użycie pętli for-each do przeszukania wartości tablicy
        for (int x : nums) {
            System.out.println(x);
            if (x == val) {
                found = true;
                break;
            }
        }

        if (found) System.out.println("Wartość została odnaleziona");
    }
}
