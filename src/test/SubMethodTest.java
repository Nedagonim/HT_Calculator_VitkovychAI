package test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SubMethodTest extends CalculatorTest {

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
}
