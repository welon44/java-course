package pl.exercises.zad9basic;

import java.util.Scanner;

public class MainZad9 {
    public static void main(String[] args) {
        Zad9Basic zad9basic = new Zad9Basic();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wpisz liczbę: ");
        int newNumber = scanner.nextInt();
        zad9basic.initWave(newNumber);

    }
}
