package pl.codecool.homework.generics;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Generics<T> {

    List<T> filter(List<T> tList, Predicate<T> tPredicate) {
        return tList.stream().filter(tPredicate).collect(Collectors.toList());
    }

}
