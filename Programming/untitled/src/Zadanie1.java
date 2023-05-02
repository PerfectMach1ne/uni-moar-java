import java.util.Collection;
import java.util.Scanner;
import java.util.function.IntSupplier;
import java.util.stream.IntStream;

public class Zadanie1 {
    interface LambdaInterface {
        int lambdaMethod(int integer);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ile liczb naturalnych wygenerować?");
        int numberCount = sc.nextInt();

        int sum = IntStream.range(1, 2*numberCount+1).filter(value -> value % 2 == 1).sum();
        System.out.println(sum);
        sum = IntStream.range(1, 2*numberCount+1).filter(value -> value % 2 == 1 && value % 6 != 0).sum();
        System.out.println(sum);
    }

    public static void otherMethod(LambdaInterface lambdaInterface) {

    }
}
