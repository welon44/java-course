package pl.codecool.homework.generics;

public class ObjectComparator<T> implements Comparable<ObjectComparator<T>> {

    public void max(Comparable comparable1, Comparable comparable2) {
        comparable2.compareTo(comparable1);
    }

    @Override
    public int compareTo(ObjectComparator o) {
        return 0;
    }
}
