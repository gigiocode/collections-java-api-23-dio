// Create a class called "ShopCart" that represents an online shopping cart. The cart must be implemented as a list of items. Each item is represented by a class called "Item" which has attributes such as name, price and quantity. Implement the following methods:
// addItem(String name, double price, int quantity): Adds an item to the cart with the specified name, price and quantity.
// removeItem(String name): Removes an item from the cart based on its name.
// calculateTotalValue(): Calculates and returns the total value of the cart, taking into account the price and quantity of each item.
// displayItems(): Displays all items in the cart, showing their names, prices and quantities.

package list.BasicOperations;

import java.util.ArrayList;
import java.util.List;

public class ShopCart {
    private List<Item> shopList;

    public ShopCart() {
        this.shopList = new ArrayList<>();
    }

    public void addItem(String name, double price, int quantity) {
        shopList.add(new Item(name, price, quantity));
    }

    public void removeItem(String nome) {
        List<Item> itensToRemove = new ArrayList<>();
        if (!shopList.isEmpty()) {
            for (Item i : shopList) {
                if (i.getName().equalsIgnoreCase(nome)) {
                    itensToRemove.add(i);
                }
            }
            shopList.removeAll(itensToRemove);
        } else {
            System.out.println("The list is empty!");
        }
    }

    public double calculateTotalValue() {
        double totalValue = 0d;
        if (!shopList.isEmpty()) {
            for (Item item : shopList) {
                double itemValue = item.getPrice() * item.getQtty();
                totalValue += itemValue;
            }
            return totalValue;
        } else {
            throw new RuntimeException("The list is empty!");
        }
    }

    public void displayItems() {
        if (!shopList.isEmpty()) {
            System.out.println(this.shopList);
        } else {
            System.out.println("The list is empty!");
        }
    }

    @Override
    public String toString() {
        return "CarrinhoDeCompras{" +
                "items=" + shopList +
                '}';
    }

    // Unitary Tests
    public static void main(String[] args) {

        ShopCart ShopCart = new ShopCart();

        ShopCart.addItem("Pencil", 2d, 3);
        ShopCart.addItem("Pencil", 2d, 3);
        ShopCart.addItem("Book", 35d, 1);
        ShopCart.addItem("Pen", 2d, 2);

        ShopCart.displayItems();

        ShopCart.removeItem("Pencil");

        ShopCart.displayItems();

        System.out.println("Your cart price is = U$ " + ShopCart.calculateTotalValue());
    }
}
