package pl.codecool.lambda_stream.stream.exercises.zad10;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Basket basket = new Basket();

        Product product1 = new GenericProduct(() -> 3000d, date -> date.isAfter(LocalDate.of(2021,10,1)));
        Product product2 = new GenericProduct(() -> 100d, date -> date.isAfter(LocalDate.of(2023, 11, 11)));

        basket.addProduct(product1);
        basket.addProduct(product2);

        basket.getBasket().forEach(product -> System.out.printf("Czy produkt o cenie %f jest dostępny? %b\n", product.getPrice(), product.productAvailibility(LocalDate.now())));

    }
}
