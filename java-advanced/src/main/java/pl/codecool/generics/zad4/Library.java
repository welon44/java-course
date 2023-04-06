package pl.codecool.generics.zad4;

import java.util.List;

public class Library<T extends Medium> {

    private final List<T> tList;

    public Library(List<T> tList) {
        this.tList = tList;
    }

    public List<T> gettList() {
        return tList;
    }

    public void addItemToList(T item) {
        tList.add(item);
    }

    public void removeItem(T item) {
        tList.remove(item);
    }

    @Override
    public String toString() {
        return "Library{" +
                "tList=" + tList +
                '}';
    }


}
