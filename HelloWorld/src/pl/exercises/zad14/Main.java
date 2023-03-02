package pl.exercises.zad14;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Zad14 zad14 = new Zad14();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Wpisz pierwsza litere: ");
        char firstLetter = scanner.next().charAt(0);

        System.out.println("Wpisz drugą litere: ");
        char secondLetter = scanner.next().charAt(0);

        zad14.countLetter(firstLetter, secondLetter);

    }
}
