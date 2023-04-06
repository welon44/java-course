package pl.codecool.generics.zad1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {

        Pair<String, String> stringPair = new Pair<>("String 1", "String 2");
        Predicate<String> stringLengthEqualsFive = s -> s.length() == 5;

        List<String> stringList = new ArrayList<>();
        stringList.add("zaba");
        stringList.add("kajak");
        stringList.add("drewno");

        System.out.println("COUNT IF");
        var countIfValue = stringPair.countIf(stringList, stringLengthEqualsFive);
        System.out.println("countIf: " + countIfValue);

        System.out.println("SWAP");
        stringPair.swap(stringList, 0, 2);
        System.out.println("String list: " + stringList);

    }
}
