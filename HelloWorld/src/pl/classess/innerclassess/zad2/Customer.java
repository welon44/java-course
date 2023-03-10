package pl.classess.innerclassess.zad2;

import java.util.ArrayList;
import java.util.List;

public class Customer {

    public class ShoppingCart {

        List<Item> cart = new ArrayList<>();

        public List<Item> getCart() {
            return cart;
        }

        public void setCart(Item[] cart) {
            this.cart = List.of(cart);
        }

        public void addItem(Item item) {
            this.cart.add(item);
        }

        public void removeItem(Item item) {
            this.cart.remove(item);
        }

        public int calculateTotalPrice(List<Item> items) {
            int result = 0;
            for (Item item : items) {
                result = item.getPrice() + result;
            }

            return result;
        }

        @Override
        public String toString() {
            return "ShoppingCart{" +
                    "cart=" + cart +
                    '}';
        }

    }
}
