package CalculatorBiFunctionLambdas;

import java.util.function.BiFunction;

public class FunctionalCalculator {
    public static Integer calculate(int num1, int num2, BiFunction<Integer, Integer, Integer> operation){
        return operation.apply(num1, num2);
    }

    public static Integer add(int a, int b) {
        return a + b;
    }
    public static Integer subtract(int a, int b) {
        return a - b;
    }   
    public static Integer multiply(int a, int b) {
        return a * b;
    }
    public static Integer divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return a / b;
    }
    
}
