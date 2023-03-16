package pl.exercises.exercisetwo;

import java.util.Scanner;

public class ExerciseTwo {
    Scanner myScanner = new Scanner(System.in);
    private float weight;
    private float height;

    float getWeight() {
        System.out.println("Podaj wagę w kg: ");
        setWeight(myScanner.nextFloat());
        System.out.println("Waga wynosi: " + this.weight + " kg");

        return weight;
    }

    float getHeight() {
        System.out.println("Podaj wzrost w centymetrach: ");
        this.setHeight(myScanner.nextInt());
        System.out.println("Wzrost wynosi: " + height + " cm");

        return height/100f;
    }

    public void checkBmi() {
        float bmi = getWeight() / getHeight();

        System.out.println("BMI wynosi " + bmi);

        if (bmi > 24.9 || bmi < 18.5) {
            System.out.println("BMI nieoptymalne");
        } else {
            System.out.println("BMI optymalne");
        }
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
}
