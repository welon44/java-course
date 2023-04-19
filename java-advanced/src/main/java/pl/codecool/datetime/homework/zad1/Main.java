package pl.codecool.datetime.homework.zad1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Main {

    public static void main(String[] args) throws Exception {
        Zad1 zad1 = new Zad1();

        LocalDateTime date1 = LocalDateTime.of(LocalDate.of(2023, 4, 20), LocalTime.of(2, 3, 3));

        System.out.println(zad1.findDurationFromDateToNow(date1, ChronoUnit.YEARS));
        System.out.println(zad1.findDurationFromDateToNow(date1, ChronoUnit.MONTHS));
        System.out.println(zad1.findDurationFromDateToNow(date1, ChronoUnit.DAYS));
        System.out.println(zad1.findDurationFromDateToNow(date1, ChronoUnit.HOURS));
        System.out.println(zad1.findDurationFromDateToNow(date1, ChronoUnit.MINUTES));
    }
}
