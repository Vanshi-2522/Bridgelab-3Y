package classObjects.level2;

public class CartItemMain {
    public static void main(String[] args) {
        CartItem item = new CartItem("Notebook", 50.0, 2);

        item.displayTotalCost();
        item.addItem(3);
        item.displayTotalCost();
        item.removeItem(4);
        item.displayTotalCost();
    }
}
