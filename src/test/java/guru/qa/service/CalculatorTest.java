package guru.qa.service;

import guru.qa.service.impl.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    @Test
    void calculatorMultTest() {
        Calculator calculator =  new Calculator(new MockMultReader(), new MockMessageWriter());
        String result = calculator.start(); //3 5 *
        Assertions.assertEquals("3 * 5 = 15", result);
    }

    @Test
    void calculatorSumTest() {
        Calculator calculator =  new Calculator(new MockSumReader(), new MockMessageWriter());
        String result = calculator.start(); //3 5 +
        Assertions.assertEquals("3 + 5 = 8", result);
    }

    @Test
    void calculatorMinusTest() {
        Calculator calculator =  new Calculator(new MockMinusReader(), new MockMessageWriter());
        String result = calculator.start(); //13 5 -
        Assertions.assertEquals("13 - 5 = 8", result);
    }

    @Test
    void calculatorDivideTest() {
        Calculator calculator =  new Calculator(new MockDivideReader(), new MockMessageWriter());
        String result = calculator.start(); //13 5 /
        Assertions.assertEquals("8 / 2 = 4", result);
    }

    @Test
    void calculatorExpTest() {
        Calculator calculator =  new Calculator(new MockExpReader(), new MockMessageWriter());
        String result = calculator.start(); //13 5 ^
        Assertions.assertEquals("2 ^ 3 = 8", result);
    }
}