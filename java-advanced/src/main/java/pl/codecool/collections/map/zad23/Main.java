package pl.codecool.collections.map.zad23;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Map<String, Integer> animals = new HashMap<>();

        animals.put("Cow", 1);
        animals.put("Dog", 2);
        animals.put("Cat", 4);

        Zoo zoo = new Zoo(animals);

        System.out.println("Liczba wszystkich zwierząt: " + zoo.getNumberOfAllAnimals());
        System.out.println("====================");
        System.out.println("Liczba wszystkich zwierząt danego gatunku: " + zoo.getAnimalsCount());
        System.out.println("====================");
        System.out.println("Liczba wszystkich zwierząt danego gatunku posortowana: " + zoo.getAnimalsCountSorted());
        zoo.addAnimals("Bird", 4);
        System.out.println("====================");
        System.out.println("Dodaje 4 ptaszki");
        System.out.println("====================");
        System.out.println("Liczba wszystkich zwierząt po dodaniu gatunku: " + zoo.getNumberOfAllAnimals());
        System.out.println("====================");
        System.out.println("Liczba wszystkich zwierząt danego gatunku po dodaniu nowego gatunku: " + zoo.getAnimalsCount());
    }
}
