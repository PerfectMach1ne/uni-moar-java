package primitivepackagexd;

public class NumberCasting {
    public static void main(String[] args) {
        byte b = 4;
        int x = b;
        int x2 = 10; // max 127
        byte b2 = (byte)x2;

        System.out.println(b);
        System.out.println(x);
        System.out.println(x2);
        System.out.println(b2);

        int x3 = 128;
        byte b3 = (byte)x3;
        System.out.println(x3);
        System.out.println(b3);
    }
}
