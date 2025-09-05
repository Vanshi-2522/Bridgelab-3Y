package Constructor.level1;

// Person class
public class Person {
    private String name;
    private int age;

    // Parameterized constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    public Person(Person other) {
        this.name = other.name;
        this.age = other.age;
    }

    // Method to display details
    public void displayPerson() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

// Test class
class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person("Alice", 25);   // normal object
        Person p2 = new Person(p1);            // copy constructor

        p1.displayPerson();
        p2.displayPerson();
    }
}
