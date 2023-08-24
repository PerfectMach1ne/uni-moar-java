import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj liczbe a: ");
        double a = sc.nextDouble();
        System.out.println("Podaj liczbe b: ");
        double b = sc.nextDouble();

        System.out.println("Wybierz typ liczby: ");
        System.out.println("0 - int");
        System.out.println("1 - double");
        System.out.println("2 - float");
        short choice;
        switch (choice = sc.nextByte()) {
            case 0:
                choice = 0;
                System.out.println("Wybrano typ int");
                break;
            case 1:
                choice = 1;
                System.out.println("Wybrano typ double");
                break;
            case 2:
                choice = 2;
                System.out.println("Wybrano typ float");
                break;
            default:
                System.out.println("Wybrano niepoprawną opcję, opuszczanie programu...");
                break;
        }

        choice((byte)choice, a, b);

        sc.close ();
    }

    static void choice (byte b, double number1, double number2) {
        switch (b) {
            case 0:
                operationZero((char)b, number1, number2);
                break;
            case 1:
                operationOne((char)b, number1, number2);
                break;
            case 2:
                operationTwo((char)b, number1, number2);
                break;
            default:
                System.out.println("Wystąpił błąd.");
                System.exit(1);
        }
    }

    static void operationZero(char c, double number1, double number2) {
        System.out.println((int)number1 + " i " + (int)number2);
    }

    static void operationOne(char c, double number1, double number2) {
        System.out.println(number1 + " i " + number2);
    }

    static void operationTwo(char c, double number1, double number2) {
        System.out.println((float)number1 + " i " + (float)number2);
    }
}
