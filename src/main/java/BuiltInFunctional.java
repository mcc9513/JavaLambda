import java.util.function.Predicate;
import java.util.function.Function;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class BuiltInFunctional {
    public static void main(String[] args) {
        // Predicate example
        Predicate<Integer> isEven = num -> num % 2 == 0;
        System.out.println("Is 4 even? " + isEven.test(4));

        // Function example
        Function<String, Integer> stringLength = str -> str.length();
        System.out.println("Length of 'Hello': " + stringLength.apply("Hello"));

        // Consumer example
        Consumer<String> printMessage = message -> System.out.println("Message: " + message);
        printMessage.accept("Hello from Consumer!");

        // Supplier example
        Supplier<Double> randomValue = () -> Math.random();
        System.out.println("Random value: " + randomValue.get());
    }
}
