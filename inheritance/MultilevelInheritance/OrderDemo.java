package inheritance.MultilevelInheritance;

// OrderDemo.java

class Order {
    String orderId;
    String orderDate;

    Order(String orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    String getOrderStatus() {
        return "Order placed on " + orderDate;
    }

    void displayDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Order Date: " + orderDate);
        System.out.println("Status: " + getOrderStatus());
    }
}

class ShippedOrder extends Order {
    String trackingNumber;

    ShippedOrder(String orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    @Override
    String getOrderStatus() {
        return "Order shipped. Tracking Number: " + trackingNumber;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Tracking Number: " + trackingNumber);
    }
}

class DeliveredOrder extends ShippedOrder {
    String deliveryDate;

    DeliveredOrder(String orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    @Override
    String getOrderStatus() {
        return "Order delivered on " + deliveryDate;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Delivery Date: " + deliveryDate);
    }
}

public class OrderDemo {
    public static void main(String[] args) {
        Order order = new Order("ORD001", "2025-09-15");
        ShippedOrder shippedOrder = new ShippedOrder("ORD002", "2025-09-14", "TRK12345");
        DeliveredOrder deliveredOrder = new DeliveredOrder("ORD003", "2025-09-13", "TRK67890", "2025-09-17");

        System.out.println("----- Order -----");
        order.displayDetails();

        System.out.println("\n----- Shipped Order -----");
        shippedOrder.displayDetails();

        System.out.println("\n----- Delivered Order -----");
        deliveredOrder.displayDetails();
    }
}
