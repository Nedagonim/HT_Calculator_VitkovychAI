package test;

import com.epam.tat.module4.Calculator;
import org.junit.jupiter.api.BeforeEach;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

}
