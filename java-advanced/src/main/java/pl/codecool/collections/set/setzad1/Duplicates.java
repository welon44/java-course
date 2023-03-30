package pl.codecool.collections.set.setzad1;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Duplicates {

    public Set<Integer> findDuplicates(List<Integer> integersList) {
        Set<Integer> items = new HashSet<>();

        return integersList.stream().filter(n -> !items.add(n)).collect(Collectors.toSet());
    }

    public Set<Integer> findUniques(List<Integer> integersList) {
        Set<Integer> newList = new HashSet<>(integersList);
        newList.removeAll(findDuplicates(integersList));
        return newList;
    }

}
