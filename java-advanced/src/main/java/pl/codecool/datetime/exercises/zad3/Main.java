package pl.codecool.datetime.exercises.zad3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Zad3 zad3 = new Zad3();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Wpisz rok: ");
        int year = scanner.nextInt();
        System.out.print("Wpisz miesiąc: ");

        int month = scanner.nextInt();
        zad3.printCardFromCalendar(year, month);
    }
}
