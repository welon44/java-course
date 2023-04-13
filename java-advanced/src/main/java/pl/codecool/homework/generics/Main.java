package pl.codecool.homework.generics;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {

        Generics<Integer> integerGenerics = new Generics<>();

        List<Integer> integerList = new ArrayList<>();
        integerList.add(-1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);

        Predicate<Integer> numbersBiggerThanZeroPredicate = n -> n > 0;

        var numbersBiggerThanZero = integerGenerics.filter(integerList, numbersBiggerThanZeroPredicate);

        System.out.println("Liczby większe od zera: " + numbersBiggerThanZero);
    }
}
