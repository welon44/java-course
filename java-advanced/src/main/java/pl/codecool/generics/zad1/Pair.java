package pl.codecool.generics.zad1;

import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Pair<T, U> {

    private T first;
    private U second;

    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public List<T> countIf(List<T> tList, Predicate<T> predicate) {
        return tList.stream().filter(predicate).collect(Collectors.toList());
    }

    public <T> void swap (List<T> l, int i, int j) {
        Collections.swap(l, i, j);
    }
}
