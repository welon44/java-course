package pl.codecool.regular_expressions.homework.zad7;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Zad7 zad7 = new Zad7();
        Scanner scanner = new Scanner(System.in);

        String newUrl;

        do {
            System.out.println("Wpisz tekst: ");
            newUrl = scanner.nextLine();
        } while (zad7.isCorrectUrl(newUrl));
    }

}
