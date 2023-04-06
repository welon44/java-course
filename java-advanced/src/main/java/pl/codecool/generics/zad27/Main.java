package pl.codecool.generics.zad27;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Joiner<String> stringJoiner = new Joiner<>("-");
        Joiner<Integer> integerJoiner = new Joiner<>("&&");

        List<String> stringList = new ArrayList<>();
        stringList.add("test");
        stringList.add("test2");
        stringList.add("test3");

        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(11);
        integerList.add(111);

        System.out.println("Lista stringów z separatorem: " + stringJoiner.join(stringList));
        System.out.println("Lista integerów z separatorem: " + integerJoiner.join(integerList));

    }
}
