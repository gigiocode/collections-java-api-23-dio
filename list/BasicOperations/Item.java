// Create a class called "ShoppingCart" that represents an online shopping cart. The cart must be implemented as a list of items. Each item is represented by a class called "Item" which has attributes such as name, price and quantity. Implement the following methods:
// addItem(String name, double price, int quantity): Adds an item to the cart with the specified name, price and quantity.
// removeItem(String name): Removes an item from the cart based on its name.
// calculateTotalValue(): Calculates and returns the total value of the cart, taking into account the price and quantity of each item.
// displayItems(): Displays all items in the cart, showing their names, prices and quantities.

package list.BasicOperations;

public class Item {

    private String name;
    private double price;
    private int qtty;

    public Item(String name, double price, int qtty) {
        this.name = name;
        this.price = price;
        this.qtty = qtty;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQtty() {
        return qtty;
    }

    @Override
    public String toString() {
        return "Item [name=" + name + ", price=" + price + ", qtty=" + qtty + "]";
    }     
    
}
