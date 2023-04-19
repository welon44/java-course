package pl.codecool.datetime.homework.zad3;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) throws Exception {

        Zad3 zad3 = new Zad3();

        LocalDate date1 = LocalDate.of(2023, 4, 19);

        System.out.println("Do końca pdoanego dnia pozostało: " + zad3.minutesElapsedToDate(date1) + " minut.");

    }
}
