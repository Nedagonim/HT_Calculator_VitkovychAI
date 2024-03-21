package test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TrigMethodTest extends CalculatorTest {

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
}
