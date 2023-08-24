package Cwiczenie7_3;

public class IfElse {
    public static void main(String[] args) {
        int month = 4;  // kwiecien
        String season;

        if (month == 12 || month == 1 || month == 2)
            season = "Zima";
        else if (month == 3 || month == 4 || month == 5)
            season = "Wiosna";
        else if (month == 6 || month == 7 || month == 8)
            season = "Lato";
        else if (month == 9 || month == 10 || month == 11)
            season = "Jesień";
        else
            season = "Undefined";

        System.out.println(season);
    }
}
