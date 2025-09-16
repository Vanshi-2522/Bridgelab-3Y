package objectmodeling;

import java.util.*;

// Product class (independent, can exist without order)
class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() { return name; }
    public double getPrice() { return price; }
}

// Order class (aggregates products, linked to a customer)
class Order {
    private static int orderCounter = 1;  // unique order ID
    private int orderId;
    private Customer customer;  // association
    private List<Product> products; // aggregation

    public Order(Customer customer) {
        this.orderId = orderCounter++;
        this.customer = customer;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product p) {
        products.add(p);
    }

    public void showOrderDetails() {
        System.out.println("Order ID: " + orderId + " placed by " + customer.getName());
        System.out.println("Products:");
        double total = 0;
        for (Product p : products) {
            System.out.println(" - " + p.getName() + " ($" + p.getPrice() + ")");
            total += p.getPrice();
        }
        System.out.println("Total: $" + total);
    }
}

// Customer class (can place multiple orders)
class Customer {
    private String name;
    private List<Order> orders;  // association with Order

    public Customer(String name) {
        this.name = name;
        this.orders = new ArrayList<>();
    }

    public String getName() { return name; }

    // Communication → customer places an order
    public Order placeOrder() {
        Order o = new Order(this);
        orders.add(o);
        System.out.println(name + " placed a new order (ID: " + orders.size() + ")");
        return o;
    }

    public void showOrders() {
        System.out.println("Customer: " + name + " has " + orders.size() + " orders.");
        for (Order o : orders) {
            o.showOrderDetails();
        }
    }
}

// Main driver
public class EcommerceDemo {
    public static void main(String[] args) {
        // Create products
        Product p1 = new Product("Laptop", 800.0);
        Product p2 = new Product("Headphones", 50.0);
        Product p3 = new Product("Smartphone", 600.0);

        // Create customer
        Customer c1 = new Customer("Alice");

        // Customer places an order
        Order o1 = c1.placeOrder();
        o1.addProduct(p1);
        o1.addProduct(p2);

        // Another order
        Order o2 = c1.placeOrder();
        o2.addProduct(p3);

        // Show all orders
        System.out.println("\n--- Order Details ---");
        c1.showOrders();
    }
}

