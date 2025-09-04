package classObjects.level1;

public class ItemMain {
    public static void main(String[] args) {
        // Create item object
        Item item1 = new Item(101, "Notebook", 50.0);

        // Show item details
        item1.displayItem();

        // Quantity and total cost
        int quantity = 5;
        double totalCost = item1.calculateTotalCost(quantity);

        System.out.println("Quantity   : " + quantity);
        System.out.println("Total Cost : " + totalCost);
    }
}
