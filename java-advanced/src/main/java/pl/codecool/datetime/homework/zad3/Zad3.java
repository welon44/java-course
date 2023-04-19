package pl.codecool.datetime.homework.zad3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Zad3 {

    public Long minutesElapsedToDate(LocalDate endDate) throws Exception {

        var startDateTime = LocalDateTime.now();
        var endDateTime = LocalDateTime.of(endDate, LocalTime.MAX);

        long duration;

        if (endDateTime.isBefore(startDateTime)) {
            throw new Exception("Podana data nie może być wcześniejsza niz dzisiejsza.");
        } else {
            duration = ChronoUnit.MINUTES.between(startDateTime, endDateTime);
        }

        return duration;
    }
}
