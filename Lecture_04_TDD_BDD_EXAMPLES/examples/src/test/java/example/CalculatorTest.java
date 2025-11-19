package example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    Calculator calc = new Calculator();


    @Test
    void testAddition() {
        assertEquals(5, calc.add(2, 3)); // Expect 2 + 3 = 5
    }

    @Test
    void testSubtraction() {
        assertEquals(1, calc.subtract(3, 2)); // Expect 3 - 2 = 1
    }

}
