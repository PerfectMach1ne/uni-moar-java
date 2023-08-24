package w5.w6;

public class ToSwitch5 {
    public static void main(String[] args) {
        toSwitch();
    }

    public static void toSwitch() {
        Days today = Days.FRIDAY;
        String response = "";
        switch(today) {
            case MONDAY:
                response = "Bierz się do pracy!!!";
                break;
            case FRIDAY:
                response = "Czas na odpoczynek!!!!!!!";
                break;
            default:
                response = "Ucz się j. angielskiego . . .";
                break;
        }
        System.out.println(response);
    }
}
