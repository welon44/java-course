package pl.codecool.homework.zad5;

import java.util.List;

public class House<T extends Animal> {

    private final List<T> tList;

    public House(List<T> tList) {

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
        return "House{" +
                "tList=" + tList +
                '}';
    }

}
