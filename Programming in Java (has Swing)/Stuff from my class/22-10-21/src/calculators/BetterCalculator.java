package calculators;

public class BetterCalculator {
    static int number1 = 1;
    static int number2 = 2;

    public static void main(String[] args) {
        int additionResult = number1 + number2;
        int subtractionResult = number1 - number2;
        int multiplicationResult = number1 * number2;
        double divisionResult = (double)number1 / (double)number2;

        System.out.println("Suma liczb " + number1 + " i " + number2 + " wynosi " + additionResult);
        System.out.println("Roznica liczb " + number1 + " i " + number2 + " wynosi " + subtractionResult);
        System.out.println("Produkt liczb " + number1 + " i " + number2 + " wynosi " + multiplicationResult);
        System.out.println("Iloraz liczb " + number1 + " i " + number2 + " wynosi " + divisionResult);
    }
}
