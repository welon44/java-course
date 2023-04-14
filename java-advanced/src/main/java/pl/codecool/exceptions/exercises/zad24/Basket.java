package pl.codecool.exceptions.exercises.zad24;

import java.util.ArrayList;
import java.util.List;

public class Basket {

    private int capacity;

    public Basket(int capacity) {
        this.capacity = capacity;
    }

    private final List<String> basket = new ArrayList<>();

    public void addToBasket(String item) throws BasketFullException {
        if (basket.size() >= capacity) {
            throw new BasketFullException("Koszyk pełny");
        } else {
            basket.add(item);
        }
    }

    public void removeFromBasket(String item) throws BasketEmptyException {
        if (basket.size() == 0) {
            throw new BasketEmptyException("Koszyk pusty");
        } else {
            basket.remove(item);
        }
    }

}
