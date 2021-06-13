package guru.qa.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calculator =  new Calculator(new MockMultReader());

    @Test
    void sumTest() {
        int sum = calculator.sum(3,5);
        Assertions.assertEquals(8, sum);

    }

    @Test
    void multTest() {
        int mult = calculator.mult(3,5);
        Assertions.assertEquals(15, mult);

    }
}