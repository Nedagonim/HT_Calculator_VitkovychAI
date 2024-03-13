package test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.epam.tat.module4.Calculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


public class CalculatorTest {

    Calculator calculator = new Calculator();

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    void testSumForLong() {
        assertEquals(5, calculator.sum(2, 3));
    }

    @Test
    void testSumForDouble() {
        assertEquals(5.5, calculator.sum(2.5, 3.0));
    }

    @ParameterizedTest
    @CsvSource({"1, 2, 3", "0, 0, 0", "-1, -2, -3"})
    void testSumWithParameters(long a, long b, long expected) {
        assertEquals(expected, calculator.sum(a, b));
    }

    @Test
    void testSubForLong() {
        assertEquals(3, calculator.sub(5, 2));
    }

    @Test
    void testSubForDouble() {
        assertEquals(2.5, calculator.sub(5.5, 3.0));
    }

    @ParameterizedTest
    @CsvSource({"5, 2, 3", "0, 0, 0", "-1, -2, 1"})
    void testSubWithParameters(long a, long b, long expected) {
        assertEquals(expected, calculator.sub(a, b));
    }

    @Test
    void testMultForLong() {
        assertEquals(10, calculator.mult(2, 5));
    }

    @Test
    void testMultForDouble() {
        assertEquals(15.0, calculator.mult(5.0, 3.0));
    }

    @ParameterizedTest
    @CsvSource({"2, 5, 10", "0, 0, 0", "-1, -2, 2"})
    void testMultWithParameters(long a, long b, long expected) {
        assertEquals(expected, calculator.mult(a, b));
    }

    @Test
    void testDivForLong() {
        assertEquals(2, calculator.div(10, 5));
    }

    @Test
    void testDivForDouble() {
        assertEquals(2.5, calculator.div(5.0, 2.0));
    }

    @ParameterizedTest
    @CsvSource({"10, 5, 2", "0, 5, 0"})
    void testDivWithParameters(long a, long b, long expected) {
        assertEquals(expected, calculator.div(a, b));
    }

    @Test
    void testPow() {
        assertEquals(16.0, calculator.pow(4.0, 2.0));
    }

    @Test
    void testSqrt() {
        assertEquals(2.0, calculator.sqrt(4.0));
    }

    @Test
    void testTg() {
        assertEquals(-0.1425465430727780, calculator.tg(Math.PI / 3.)); // tan(3)
    }

    @Test
    void testCtg() {
        assertEquals(-0.4576575543602857, calculator.ctg(2)); // ctg(2)
    }

    @Test
    void testCos() {
        assertEquals(0.70710678118654757, calculator.cos(Math.PI / 4)); // cos(π/4)
    }

    @Test
    void testSin() {
        assertEquals(0.8660254037844386, calculator.sin(Math.PI / 3)); // sin(π/3)
    }

    @Test
    void testIsPositive() {
        assertTrue(calculator.isPositive(5));
        assertFalse(calculator.isPositive(0));
        assertFalse(calculator.isPositive(-5));
    }

    @Test
    void testIsNegative() {
        assertTrue(calculator.isNegative(-5));
        assertFalse(calculator.isNegative(0));
        assertFalse(calculator.isNegative(5));
    }
}
