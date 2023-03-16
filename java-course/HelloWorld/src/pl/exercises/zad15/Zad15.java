package pl.exercises.zad15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Zad15 {

    ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 45, 55, 3, 32, 22, 22, 55, 1, 1));

    void printDuplicatesNumbers() {
        HashSet<Integer> hCheckSet = new HashSet<>();
        HashSet<Integer> hTargetSet = new HashSet<>();
        for (Integer integer : arr) {
            if(!hCheckSet.add(integer)) {
                hTargetSet.add(integer);
            }
        }
        System.out.println("Duplikaty to " + hTargetSet);
    }

}
