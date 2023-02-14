package pl.exercises.exercisefour;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ExerciseFour exerciseFour = new ExerciseFour();
        System.out.println("Podaj liczbe: ");
        int newNumber = scanner.nextInt();

        for (int i = 1; i <= newNumber; i++) {
            exerciseFour.checkIfNumberIsDivisibleByThreeAndSeven(i);
            exerciseFour.checkIfNumberIsDivisibleByThree(i);
            exerciseFour.checkIfNumberIsDivisibleBySeven(i);
        }
    }
}
