package pl.exercises.zad21;

import pl.exercises.zad20.Shape;
import pl.exercises.zad22.Fillable;

public abstract class ThreeDeeShape extends Shape implements Fillable {

    public abstract double calculateVolume();

    @Override
    public void fill(int waterAmount) {
        if (waterAmount > calculateVolume()) {
            System.out.println("Przelało się");
        }

        if (waterAmount == calculateVolume()) {
            System.out.println("Napełniło po brzegi");
        }

        if (waterAmount < calculateVolume()) {
            System.out.println("Za mało");
        }
    }
}
