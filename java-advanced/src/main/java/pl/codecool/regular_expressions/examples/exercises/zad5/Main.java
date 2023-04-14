package pl.codecool.regular_expressions.examples.exercises.zad5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Zad5 zad5 = new Zad5();
        Scanner scanner = new Scanner(System.in);

        String newString;

        do {
            System.out.println("Wpisz tekst: ");
            newString = scanner.nextLine();
            var result = zad5.findPhoneNumbers(newString);
            System.out.println(result);
        } while (zad5.findPhoneNumbers(newString).size() != 0);
    }
}
