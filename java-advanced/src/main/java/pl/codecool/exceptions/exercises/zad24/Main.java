package pl.codecool.exceptions.exercises.zad24;

public class Main {

    public static void main(String[] args) {

        Basket basket = new Basket(5);

        try {
            basket.addToBasket("Koło");
            basket.addToBasket("Koło");
            basket.addToBasket("Koło");
            basket.addToBasket("Koło");
            basket.addToBasket("Koło");
            basket.addToBasket("Koło");
            basket.addToBasket("Koło");
        } catch (BasketFullException e) {
            System.out.println(e.getMessage());
        }

        try {
            basket.removeFromBasket("Koło");
            basket.removeFromBasket("Koło");
            basket.removeFromBasket("Koło");
            basket.removeFromBasket("Koło");
            basket.removeFromBasket("Koło");
            basket.removeFromBasket("Koło");
            basket.removeFromBasket("Koło");
            basket.removeFromBasket("Koło");
            basket.removeFromBasket("Koło");
            basket.removeFromBasket("Koło");
            basket.removeFromBasket("Koło");
        } catch (BasketEmptyException e) {
            System.out.println(e.getMessage());
        }
    }
}
