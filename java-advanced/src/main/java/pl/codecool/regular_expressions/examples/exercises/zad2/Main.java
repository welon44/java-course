package pl.codecool.regular_expressions.examples.exercises.zad2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Zad2 zad2 = new Zad2();
        Scanner scanner = new Scanner(System.in);

        String newString;

        do {
            System.out.println("Wpisz tekst: ");
            newString = scanner.nextLine();
            var result = zad2.findAndReplace(newString);
            System.out.println(result);
        } while (zad2.findAndReplace(newString) != null);

    }

}
