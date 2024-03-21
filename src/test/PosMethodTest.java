package test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PosMethodTest extends CalculatorTest {
    @Test
    void testIsPositive() {
        assertTrue(calculator.isPositive(5));
        assertFalse(calculator.isPositive(0));
        assertFalse(calculator.isPositive(-5));
    }
}
