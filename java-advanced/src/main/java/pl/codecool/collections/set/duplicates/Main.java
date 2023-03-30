package pl.codecool.collections.set.duplicates;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(5);
        integerList.add(5);
        integerList.add(7);
        integerList.add(7);
        integerList.add(9);
        integerList.add(9);
        integerList.add(10);
        integerList.add(10);

        Duplicates duplicates = new Duplicates();
        var duplicates1 = duplicates.findDuplicates(integerList);
        var uniques = duplicates.findUniques(integerList);


        System.out.println("Duplikaty: " + duplicates1);
        System.out.println("Unikaty: " + uniques);
    }
}
