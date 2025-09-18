package inheritance.HybridInheritance;
// RestaurantDemo.java

interface Worker {
    void performDuties();
}

class Person {
    String name;
    int id;

    Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}

class Chef extends Person implements Worker {

    Chef(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println(name + " is cooking dishes.");
    }

    @Override
    void displayInfo() {
        System.out.println("Role: Chef");
        super.displayInfo();
    }
}

class Waiter extends Person implements Worker {

    Waiter(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println(name + " is serving customers.");
    }

    @Override
    void displayInfo() {
        System.out.println("Role: Waiter");
        super.displayInfo();
    }
}

public class RestaurantDemo {
    public static void main(String[] args) {
        Chef chef = new Chef("Alice", 101);
        Waiter waiter = new Waiter("Bob", 102);

        Person[] staff = { chef, waiter };

        for (Person p : staff) {
            p.displayInfo();
            if (p instanceof Worker) {
                ((Worker) p).performDuties();
            }
            System.out.println("---------------------");
        }
    }
}
