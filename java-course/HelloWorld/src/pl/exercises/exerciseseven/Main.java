package pl.exercises.exerciseseven;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ExerciseSeven exerciseSeven = new ExerciseSeven();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbe: ");
        int newNumber = scanner.nextInt();

        for (int counter = 0; counter <= newNumber; counter++) {
            System.out.printf("Element %d. ciągu Fibonacciego to: %d%n", counter,
                              exerciseSeven.fibonacci(BigInteger.valueOf(counter)));
        }
    }
}
