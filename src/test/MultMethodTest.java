package test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultMethodTest extends CalculatorTest {
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
}
