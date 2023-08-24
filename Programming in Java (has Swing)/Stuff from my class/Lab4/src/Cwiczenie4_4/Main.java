package Cwiczenie4_4;

import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ageCheck();

        GregorianCalendar gregCal = new GregorianCalendar();
        int today = gregCal.get(Calendar.DAY_OF_MONTH);
        int month = gregCal.get(Calendar.MONTH);

        gregCal.set(Calendar.DAY_OF_MONTH, 1);
        int weekday = gregCal.get(Calendar.DAY_OF_WEEK);
        int firstDayOfWeek = gregCal.getFirstDayOfWeek();

        int indent = 0;
        while (weekday != firstDayOfWeek) {
            indent++;
            gregCal.add(Calendar.DAY_OF_MONTH, -1);
            weekday = gregCal.get(Calendar.DAY_OF_WEEK);
        }

        String[] weekdayNames = new DateFormatSymbols().getShortWeekdays();
        do {
            System.out.printf("%4s", weekdayNames[weekday]);
            gregCal.add(Calendar.DAY_OF_MONTH, 1);
            weekday = gregCal.get(Calendar.DAY_OF_WEEK);
        } while (weekday != firstDayOfWeek);

        System.out.println();
        for (int i = 1; i <= indent; i++) System.out.print("    ");

        gregCal.set(Calendar.DAY_OF_MONTH, 1);
        do {
            int day = gregCal.get(Calendar.DAY_OF_MONTH);
//            System.out.printf("%3d", day);
            if (day == today)
                System.out.print(" * ");
            else
                System.out.printf("%3d", day);
                System.out.print(" ");
            gregCal.add(Calendar.DAY_OF_MONTH, 1);
            weekday = gregCal.get(Calendar.DAY_OF_WEEK);
            if (weekday == firstDayOfWeek)
                System.out.println();
        } while (gregCal.get(Calendar.MONTH) == month);

        if (weekday != firstDayOfWeek)
            System.out.println();
    }

    public static void ageCheck() {
        Scanner sc = new Scanner(System.in);
        int wiek = 0;

        System.out.println("Podaj swój wiek: ");
        boolean loopControl = false;
        while (!loopControl) {
            try {
                wiek = sc.nextInt();
                loopControl = true;
            } catch (InputMismatchException imex) {
                System.out.println("Podaj poprawny wiek!");
                sc.next();  // C o n s u m e the InputMismatchException token
            }
        }

        if (wiek < 18) {
            System.out.println("Nietrzeźwym i młodzieży do lat 18-tu kalendarza nie sprzedajemy.");
            System.exit(0);
        } else {
            System.out.println("Uruchamiam kalendarz (+18) . . .");
        }
    }
}
