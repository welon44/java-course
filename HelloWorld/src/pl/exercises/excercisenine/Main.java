package pl.exercises.excercisenine;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ExerciseNine exerciseNine = new ExerciseNine();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wpisz liczbę: ");
        int newNumber = scanner.nextInt();
        exerciseNine.drawWave(newNumber);

    }
}
