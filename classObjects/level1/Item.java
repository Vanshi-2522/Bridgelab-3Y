package classObjects.level1;

public class Item {
    int itemCode;
    String itemName;
    double price;

    // Constructor
    public Item(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    // Display item details
    public void displayItem() {
        System.out.println("Item Details:");
        System.out.println("Code  : " + itemCode);
        System.out.println("Name  : " + itemName);
        System.out.println("Price : " + price);
    }

    // Calculate total cost for given quantity
    public double calculateTotalCost(int quantity) {
        return price * quantity;
    }
}
