package pl.codecool.datetime.examples;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;

public class LocalDateExample {

    public static void main(String[] args) {

        LocalDate localDate = LocalDate.now();

//        localDate = LocalDate.of(1990, 4, 14);

        System.out.println(localDate.withDayOfMonth(10).getDayOfWeek());

        LocalDate start = LocalDate.now();
        LocalDate end = start.plusDays(21);

        Duration timeDuration = Duration.between(start.atStartOfDay(), end.atStartOfDay());

        Period period = Period.between(start, end);

        System.out.println(timeDuration.toHours());

        System.out.println(period);

    }
}
