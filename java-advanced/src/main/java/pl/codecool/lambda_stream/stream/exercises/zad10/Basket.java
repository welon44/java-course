package pl.codecool.lambda_stream.stream.exercises.zad10;

import java.util.ArrayList;
import java.util.List;

public class Basket {

    List<Product> basket = new ArrayList<>();

    public List<Product> getBasket() {
        return basket;
    }

    public void addProduct(Product product) {
        this.basket.add(product);
    }

    public void removeProduct(Product product) {
        this.basket.remove(product);
    }
}
