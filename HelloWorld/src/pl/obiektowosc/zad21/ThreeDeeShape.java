package pl.obiektowosc.zad21;

import pl.obiektowosc.zad20.Shape;
import pl.obiektowosc.zad22.Fillable;

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
