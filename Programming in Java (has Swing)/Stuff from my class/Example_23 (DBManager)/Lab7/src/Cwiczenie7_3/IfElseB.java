package Cwiczenie7_3;

public class IfElseB {
    public static void main(String[] args) {
        int month = 4;  // kwiecien
        String season;

        switch (month) {
            case 12:
                season = "Zima";
                break;
            case 1:
                season = "Zima";
                break;
            case 2:
                season = "Zima";
                break;
            case 3:
                season = "Wiosna";
                break;
            case 4:
                season = "Wiosna";
                break;
            case 5:
                season = "Wiosna";
                break;
            case 6:
                season = "Lato";
                break;
            case 7:
                season = "Lato";
                break;
            case 8:
                season = "Lato";
                break;
            case 9:
                season = "Jesień";
                break;
            case 10:
                season = "Jesień";
                break;
            case 11:
                season = "Jesień";
                break;
            default:
                season = "Undefined";
                break;
        }

        System.out.println(season);
    }
}
