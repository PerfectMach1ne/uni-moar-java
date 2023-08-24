package primitivepackagexd;

public class PrimitiveDemo {
    public static void main(String[] args) {
        byte b = 100;
        short s = -123;
        int v = 123456;
        int calc = -56748;
        long amountVal = 1234567890;
        float interestRate = 21.9101f;
        double sineVal = 12345.234d;
        boolean flag = true;
        boolean val = false;
        char ch1 = 88;
        char ch2 = 'Y';

        System.out.println("byte value = " + b);
        System.out.println("short value = " + s);
        System.out.println("int value = " + v);
        System.out.println("int second value = " + calc);
        System.out.println("long value = " + amountVal);
        System.out.println("float value = " + interestRate);
        System.out.println("double value = " + sineVal);
        System.out.println("boolean values = " + flag + " and " + val);
        System.out.println("char values = " + ch1 + " and " + ch2);
        System.out.println(ch1++);
        System.out.println(ch1);
        System.out.println(--ch1);
        System.out.println(++ch1);
        System.out.println("=================");
        System.out.println(++ch2);
        System.out.println(ch2);
        ch2 += 2;
        System.out.println(ch2);
        ch2 -= 2;
        System.out.println((char)(ch2 + 2));
    }
}
