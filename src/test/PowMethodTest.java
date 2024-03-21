package test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PowMethodTest extends CalculatorTest {

    @Test
    void testPow() {
        assertEquals(16.0, calculator.pow(4.0, 2.0));
    }

}
