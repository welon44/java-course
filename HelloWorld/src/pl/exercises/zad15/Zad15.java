package pl.exercises.zad15;

import java.util.Objects;

public class Zad15 {

    Integer[] intArray = new Integer[]{ 1, 2, 3, 4, 1, 2, 3, 4, 1 };

    void printDuplicatesNumbers() {
        for (int i = 0; i < intArray.length; i++) {
            for (int j = i + i; j < intArray.length; j++) {
                if (j != i && Objects.equals(intArray[j], intArray[i])) {
                    System.out.println(intArray[i]);
                }
            }
        }
    }

}
