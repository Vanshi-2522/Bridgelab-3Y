package classObjects.level2;

public class CartItem {
    String itemName;
    double price;
    int quantity;

    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public void addItem(int qty) {
        this.quantity += qty;
        System.out.println(qty + " " + itemName + "(s) added to cart.");
    }

    public void removeItem(int qty) {
        if (qty <= quantity) {
            this.quantity -= qty;
            System.out.println(qty + " " + itemName + "(s) removed from cart.");
        } else {
            System.out.println("Not enough items to remove!");
        }
    }

    public void displayTotalCost() {
        double totalCost = price * quantity;
        System.out.println("Item: " + itemName + " | Quantity: " + quantity + " | Total Cost: " + totalCost);
    }
}
