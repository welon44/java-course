package pl.exercises.exerciseone;

import java.util.Scanner;

public class ExerciseOne {

    public static void main(String[] args) {

        double pi = Math.PI;
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Wpisz średnicę: ");

        Float diameter = myScanner.nextFloat();
        System.out.println("Srednica wynosi: " + diameter);

        System.out.println("Obwód wynosi: " + pi * diameter);
    }
}
