package pl.codecool.datetime.homework.zad1;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Zad1 {

    public String findDurationFromDateToNow(LocalDateTime startDateTime, ChronoUnit chronoUnit) throws Exception {
        var endDateTime = LocalDateTime.now();

        long duration;

        if (startDateTime.isAfter(endDateTime)) {
            throw new Exception("Data startowa jest późniejsza niż dzisiejsza");
        } else {
            duration = chronoUnit.between(startDateTime, endDateTime);
        }

        return "Upłynęło " + chronoUnit + ": " + duration;
    }
}
