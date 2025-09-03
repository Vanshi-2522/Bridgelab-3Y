

public class NullPointerDemo {

    // Method that generates NullPointerException
    public static void generateException() {
        String text = null;  // reference points to nothing
        // This will throw NullPointerException
        System.out.println("Length of text: " + text.length());
    }

    // Method that handles NullPointerException using try-catch
    public static void handleException() {
        String text = null;  // still null

        try {
            // Attempt to call method on null reference
            System.out.println("Length of text: " + text.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException! Message: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // First call method that generates exception (will crash if not commented)
        System.out.println("Calling generateException():");
        try {
            generateException();  // This will throw NPE
        } catch (Exception e) {
            System.out.println("Program crashed with exception: " + e);
        }

        // Now call method with proper handling
        System.out.println("\nCalling handleException():");
        handleException();
    }
}

