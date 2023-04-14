package pl.codecool.regular_expressions.examples.exercises.zad3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Zad3 zad3 = new Zad3();
        Scanner scanner = new Scanner(System.in);

        String newString;

        do {
            System.out.println("Wpisz tekst: ");
            newString = scanner.nextLine();
            var result = zad3.findAllEmails(newString);
            System.out.println("Liczba wystąpień: " + result);
        } while (zad3.findAllEmails(newString) != 0);
    }
}
