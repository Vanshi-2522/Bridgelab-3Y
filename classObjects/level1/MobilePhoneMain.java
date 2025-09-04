package classObjects.level1;

public class MobilePhoneMain {
    public static void main(String[] args) {
        // Create phone objects
        MobilePhone phone1 = new MobilePhone("Apple", "iPhone 15", 79999.0);
        MobilePhone phone2 = new MobilePhone("Samsung", "Galaxy S24", 69999.0);

        // Display details
        phone1.displayDetails();
        System.out.println("-------------------");
        phone2.displayDetails();
    }
}
