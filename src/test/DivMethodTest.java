package test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DivMethodTest extends CalculatorTest {
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
}
