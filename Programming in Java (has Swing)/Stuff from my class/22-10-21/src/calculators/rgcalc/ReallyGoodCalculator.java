package calculators.rgcalc;

import java.util.Scanner;

public class ReallyGoodCalculator {
    public static int add(int x, int y) {
        int result = x + y;
        return result;
    }

    public static int sub(int x, int y) {
        int result = x - y;
        return result;
    }

    public static int mult(int x, int y) {
        int result = x * y;
        return result;
    }

    public static int div(int x, int y) {
        int result = x / y;
        return result;
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int num1, num2;

        System.out.println("Enter the first number:");
        num1 = inp.nextInt();
        System.out.println("Enter the second number:");
        num2 = inp.nextInt();
        int ans;
        System.out.println("Enter your selection:\n1 for addition," +
                "\n2 for subtraction,\n3 for multiplication,\n4 for division:");

        int choose;
        choose = inp.nextInt();
        switch(choose) {
            case 1:
                System.out.println(add(num1, num2));
                break;
            case 2:
                System.out.println(sub(num1, num2));
                break;
            case 3:
                System.out.println(mult(num1, num2));
                break;
            case 4:
                System.out.println(div(num1, num2));
                break;
            default:
                System.out.println("Illegal operation!");
        }

        inp.close();
    }
}
