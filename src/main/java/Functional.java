public class Functional {
    public static void main(String[] args) {
        // Custom functional interface for string concatenation
        StringOperation concatenate = (str1, str2) -> str1 + str2;
        System.out.println("Concatenation: " + concatenate.operate("Hello, ", "World!"));

        // Custom functional interface for string length comparison
        StringComparison compareLength = (str1, str2) -> str1.length() > str2.length();
        System.out.println("Is first string longer? " + compareLength.compare("Hello", "Hi"));
    }

    @FunctionalInterface
    interface StringOperation {
        String operate(String str1, String str2);
    }

    @FunctionalInterface
    interface StringComparison {
        boolean compare(String str1, String str2);
    }
}
