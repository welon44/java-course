package pl.exercises.zad12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Zad12 zad12 = new Zad12();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wpisz tekst: ");
        String newString = scanner.nextLine();

        zad12.countSpaces(newString);

    }
}
