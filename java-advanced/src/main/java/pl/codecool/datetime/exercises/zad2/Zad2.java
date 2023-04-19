package pl.codecool.datetime.exercises.zad2;

import java.time.LocalDate;
import java.time.Period;

public class Zad2 {

    public Period periodBetween(LocalDate start, LocalDate end) {
        Period period = Period.between(start, end);
        return period;
    }
}
