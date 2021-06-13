package guru.qa.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calculator =  new Calculator(new MockMultReader());

    @Test
    void calculatorTest() {
        String result = calculator.start(); //3 5 *
        Assertions.assertEquals("3 * 5 = 15", result);
    }


}