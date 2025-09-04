package classObjects.level2;

public class PalindromeCheckerMain {
    public static void main(String[] args) {
        PalindromeChecker checker1 = new PalindromeChecker("madam");
        PalindromeChecker checker2 = new PalindromeChecker("hello");

        checker1.displayResult();
        checker2.displayResult();
    }
}
