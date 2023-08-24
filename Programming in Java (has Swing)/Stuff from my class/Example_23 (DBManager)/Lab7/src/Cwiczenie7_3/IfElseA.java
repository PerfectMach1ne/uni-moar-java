package Cwiczenie7_3;

public class IfElseA {
    public static void main(String[] args) {
        int month = 4;  // kwiecien
        String monthDays;

        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
            monthDays = "31 dni";
        else if (month == 4 || month == 6 || month == 9 || month == 11)
            monthDays = "30 dni";
        else if (month == 2)
            monthDays = "28 lub 29 dni";
        else
            monthDays = "Podano nieprawidłowy miesiąc";

        System.out.println(monthDays);
    }
}
