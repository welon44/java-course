package pl.codecool.collections.map.zad3;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Zad3 zad3 = new Zad3();

        Map<String, Integer> newMap = new HashMap<>();
        newMap.put("Java", 18);
        newMap.put("Python", 1);

        zad3.showMap(newMap);
    }
}
