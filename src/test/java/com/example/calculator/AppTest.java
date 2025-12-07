package com.example.calculator;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

    private final Calculator calc = new Calculator();

    @Test
    public void testAdd() {
        assertEquals(5, calc.add(2, 3));
    }

    @Test
    public void testSubtract() {
        assertEquals(1, calc.subtract(3, 2));
    }

    @Test
    public void testMultiply() {
        assertEquals(6, calc.multiply(2, 3));
    }

    @Test(expected = ArithmeticException.class)
    public void testDivideByZero() {
        calc.divide(5, 0);
    }
}
