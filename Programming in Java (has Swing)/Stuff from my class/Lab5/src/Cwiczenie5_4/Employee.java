package Cwiczenie5_4;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Employee {
    private String name;
    private double salary;
    private String hireDay;

    public Employee(String name, double salary, int year, int month, int day) {
        this.name = name;
        this.salary = salary;

        // Inicjalizacja LocalDate
        LocalDate localDate = LocalDate.of(year, month, day);
        // Konwersja nazw miesiecy i dni tygodnia na j. polski
        String weekdayTranslated = localDate.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.forLanguageTag("pl-PL"));
        String monthTranslated = localDate.getMonth().getDisplayName(TextStyle.FULL, Locale.forLanguageTag("pl-PL"));
        // Kapitalizacja 1-szych liter
        Character weekdayFirstChar = weekdayTranslated.charAt(0);
        Character monthFirstChar = monthTranslated.charAt(0);
        weekdayTranslated = weekdayFirstChar.toString().toUpperCase() + weekdayTranslated.substring(1);
        monthTranslated = monthFirstChar.toString().toUpperCase() + monthTranslated.substring(1);

        hireDay = weekdayTranslated + " " + monthTranslated + " " + localDate.getYear();
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getHireDay() {
        return hireDay;
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }
}
