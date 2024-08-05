public class Simple {
    public static void main(String[] args) {
        // Addition
        MathOperation add = (a, b) -> a + b;
        // Subtraction
        MathOperation subtract = (a, b) -> a - b;
        // Multiplication
        MathOperation multiply = (a, b) -> a * b;
        // Division
        MathOperation divide = (a, b) -> a / b;

        // Testing the lambda expressions
        System.out.println("Addition: " + add.operation(5, 3));
        System.out.println("Subtraction: " + subtract.operation(5, 3));
        System.out.println("Multiplication: " + multiply.operation(5, 3));
        System.out.println("Division: " + divide.operation(6, 2));
    }

    // Functional interface
    interface MathOperation {
        int operation(int a, int b);
    }
}
