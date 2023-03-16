package pl.exercises.exerciseeight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ExerciseEight exerciseEight = new ExerciseEight();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj pierwszą liczbe: ");
        float newNumber = scanner.nextFloat();

        System.out.println("Podaj znak działania: ");
        String newAction = scanner.next();

        System.out.println("Podaj drugą liczbe: ");
        float newSecondNumber = scanner.nextFloat();

        System.out.println("Wynik: " + exerciseEight.calculate(newNumber, newAction, newSecondNumber));
    }
}
