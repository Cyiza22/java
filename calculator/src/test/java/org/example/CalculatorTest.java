package org.example;

import org.junit.jupiter.api.*;


import static junit.framework.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class CalculatorTest {

    private Calculator calculator;

    @BeforeAll
    void setupAll() {
        System.out.println("Before all tests – setup shared resources.");
    }

    @AfterAll
    void tearDownAll() {
        System.out.println("After all tests – cleanup shared resources.");
    }

    @BeforeEach
    void init() {
        calculator = new Calculator();
        System.out.println("Before each test – new Calculator instance.");
    }

    @AfterEach
    void cleanup() {
        System.out.println(" After each test – test complete.");
    }

    @Test
    void testAdd() {
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    void testSubtract() {
        assertEquals(1, calculator.subtract(4, 3));
    }

    @Test
    void testMultiply() {
        assertEquals(20, calculator.multiply(4, 5));
    }

    @Test
    void testDivide() {
        assertEquals(2, calculator.divide(10, 5));
    }

    @Test
    void testDivideByZero() {
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(10, 0));
    }
}
