package pl.exercises.zad15;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Zad15 zad15 = new Zad15();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbę 1: ");
        Integer int1 = scanner.nextInt();
        System.out.println("Podaj liczbę 2: ");
        Integer int2 = scanner.nextInt();

        zad15.printDuplicatesNumbers();

    }
}
