package pl.codecool.regular_expressions.examples.exercises.zad1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Zad1 zad1 = new Zad1();
        Scanner scanner = new Scanner(System.in);

        String newString;

        do {
            System.out.println("Wpisz tekst: ");
            newString = scanner.nextLine();
        } while (zad1.containsJava(newString));

    }
}
