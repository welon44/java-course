package pl.classess.innerclassess.zad2;

public class Main {
    public static void main(String[] args) {

        Customer customer = new Customer();
        Customer.ShoppingCart shoppingCart = customer.new ShoppingCart();

        Item bread = new Item("Chleb", 5);
        Item beer = new Item("Piwo", 20);
        shoppingCart.addItem(bread);
        shoppingCart.addItem(beer);

        shoppingCart.getCart().forEach(System.out::println);

        System.out.println("Total price: " + shoppingCart.calculateTotalPrice(shoppingCart.getCart()));

        shoppingCart.removeItem(beer);

        shoppingCart.getCart().forEach(System.out::println);

        System.out.println("Total price: " + shoppingCart.calculateTotalPrice(shoppingCart.getCart()));

    }
}
