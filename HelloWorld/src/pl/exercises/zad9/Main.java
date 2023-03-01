package pl.exercises.zad9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Zad9 zad9 = new Zad9();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wpisz liczbę: ");
        int newNumber = scanner.nextInt();
        zad9.initWave(newNumber);

    }
}
