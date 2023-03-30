package pl.codecool.collections.map.zad3;

import java.util.Map;

public class Zad3 {

    public void showMap(Map<String, Integer> map) {
        int size = 1;

        for (Map.Entry<String, Integer> stringIntegerEntry : map.entrySet()) {
            if (size == map.size()) {
                System.out.printf("Klucz: %s, Wartość: %d.\n", stringIntegerEntry.getKey(), stringIntegerEntry.getValue());
            } else {
                System.out.printf("Klucz: %s, Wartość: %d,\n", stringIntegerEntry.getKey(), stringIntegerEntry.getValue());
            }

            size++;
        }
    }
}
