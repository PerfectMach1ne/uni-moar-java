package w5.w6.oog;

public class While {
    public static void main(String[] args) {
        while (true) {
            int z = 0;
            while (true) {
                if (z >= 10) break;
                else System.out.println(z++);
            }
            break;
        }
    }
}
