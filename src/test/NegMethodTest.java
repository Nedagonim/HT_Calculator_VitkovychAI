package test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class NegMethodTest extends CalculatorTest {

    @Test
    void testIsNegative() {
        assertTrue(calculator.isNegative(-5));
        assertFalse(calculator.isNegative(0));
        assertFalse(calculator.isNegative(5));
    }
}
