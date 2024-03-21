package test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SqrtMethodTest extends CalculatorTest {

    @Test
    void testSqrt() {
        assertEquals(2.0, calculator.sqrt(4.0));
    }
}
