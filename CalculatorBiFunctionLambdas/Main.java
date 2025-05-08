package CalculatorBiFunctionLambdas;

public class Main {
    public static void main(String[] args) {
        // Example usage of the FunctionalCalculator class
        int num1 = 10;
        int num2 = 5;

        // Using lambda expressions for different operations
        // Integer sum = FunctionalCalculator.calculate(num1, num2, (a, b) -> a + b);
        // Integer difference = FunctionalCalculator.calculate(num1, num2, (a, b) -> a - b);
        // Integer product = FunctionalCalculator.calculate(num1, num2, (a, b) -> a * b);
        // Integer quotient = FunctionalCalculator.calculate(num1, num2, (a, b) -> a / b);

        // Using method references for different operations
        Integer sum = FunctionalCalculator.calculate(num1, num2, FunctionalCalculator::add);
        Integer difference = FunctionalCalculator.calculate(num1, num2, FunctionalCalculator::subtract);
        Integer product = FunctionalCalculator.calculate(num1, num2, FunctionalCalculator::multiply);
        Integer quotient = FunctionalCalculator.calculate(num1, num2, FunctionalCalculator::divide);

        // Printing the results
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
    }
    
}
