package test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumMethodTest extends CalculatorTest {
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
}
