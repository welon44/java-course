package pl.codecool.datetime.exercises.zad3;

import java.time.LocalDate;
import java.time.YearMonth;


public class Zad3 {

    public void printCardFromCalendar(int year, int month) {
        YearMonth ym = YearMonth.of(year, month);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        int counter = 1;

        // Get day of week of 1st date of the month and print space for as many days as
        // distant from SUN
        int dayValue = LocalDate.of(year, month, 1).getDayOfWeek().getValue();
        if (dayValue != 7)
            for (int i = 0; i < dayValue; i++, counter++) {
                System.out.printf("%-4s", "");
            }

        for (int i = 1; i <= ym.getMonth().length(ym.isLeapYear()); i++, counter++) {
            System.out.printf("%-4d", i);

            // Break the line if the value of the counter is multiple of 7
            if (counter % 7 == 0) {
                System.out.println();
            }
        }
    }
}
