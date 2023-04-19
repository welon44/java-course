package pl.codecool.datetime.exercises.zad2;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Zad2 zad2 = new Zad2();

        LocalDate dateNow = LocalDate.now();

        LocalDate date2 = LocalDate.now().plusDays(20);
        System.out.println("Róznica nie mniej niż 30 dni: " + zad2.periodBetween(dateNow, date2));

        LocalDate date3 = LocalDate.now().plusDays(35);
        System.out.println("Róznica o więcej niż 30 dni: " + zad2.periodBetween(dateNow, date3));

        LocalDate date4 = LocalDate.now().plusMonths(6).plusDays(4);
        System.out.println("Róznica o kilka miesięcy: " + zad2.periodBetween(dateNow, date4));

        LocalDate date5 = LocalDate.now().plusYears(1).plusMonths(1).plusDays(2);
        System.out.println("Róznica o ponad rok: " + zad2.periodBetween(dateNow, date5));
    }
}
