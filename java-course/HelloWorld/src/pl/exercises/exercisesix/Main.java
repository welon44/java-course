package pl.exercises.exercisesix;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ExerciseSix exerciseSix = new ExerciseSix();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbe: ");
        int newNumber = scanner.nextInt();

        exerciseSix.sumUlamki(newNumber);

    }
}
