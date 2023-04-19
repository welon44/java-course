package pl.codecool.datetime.exercises.zad1;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Zad1 zad1 = new Zad1();

        var result = zad1.findDurationToFridayThirteen(LocalDate.now());
        System.out.printf("Do piątku 13 pozostało %d dni", result);
    }
}
