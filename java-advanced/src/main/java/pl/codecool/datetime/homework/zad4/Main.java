package pl.codecool.datetime.homework.zad4;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Zad4 zad4 = new Zad4();
        LocalDate localDate = LocalDate.now();
        zad4.daysOfWeekendCount(localDate);
    }
}
