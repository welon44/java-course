package pl.exercises.exerciseFive;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ExerciseFive exerciseFive = new ExerciseFive();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbe: ");
        int newNumber = scanner.nextInt();

        for (int i = 1; i < newNumber; i++) {
            exerciseFive.isPrime(i);
        }
    }
}
