package pl.codecool.datetime.exercises.zad1;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Zad1 {

    public long findDurationToFridayThirteen(LocalDate start) {

        LocalDate friday13 = LocalDate.now();
        while (friday13.getDayOfMonth() != 13) {
            friday13 = friday13.plusDays(1);
        }

        while (!friday13.getDayOfWeek().equals(DayOfWeek.FRIDAY)) {
            friday13 = friday13.plusMonths(1);
        }

        return ChronoUnit.DAYS.between(start.atStartOfDay(), friday13.atStartOfDay());

    }
}
