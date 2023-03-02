package pl.exercises.zad13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Zad13 zad13 = new Zad13();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Wpisz tekst: ");
        String newText = scanner.nextLine();

        zad13.extractWords(newText);
    }
}
