package IntelliJWarnings.Lambdas;

import java.util.ArrayList;
import java.util.function.Consumer;

interface StringFunction {
    String run(String str);
}

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);
        numbers.add(-1);
        numbers.add(21);

        numbers.forEach(System.out::println);   // Method reference???

        Consumer<Integer> method = System.out::println;
        numbers.forEach( method );

        StringFunction exclaim = (s) -> s + "!";
        StringFunction ask = (s) -> s + "?";
        printFormatted("Hello", exclaim);
        printFormatted("Hello", ask);
    }

    public static void printFormatted(String str, StringFunction format) {
        String result = format.run(str);
        System.out.println(result);
    }
}
