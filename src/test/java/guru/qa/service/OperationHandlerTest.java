package guru.qa.service;

import guru.qa.service.OperationHandler;
import guru.qa.service.impl.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperationHandlerTest {

    private OperationHandler handler;

    @Test
    void sumTest() {
        handler = new SumOperationHandler();
        int sum = handler.invoke(3,5);
        Assertions.assertEquals(8, sum);

    }

    @Test
    void multTest() {
        handler = new MultOperationHandler();
        int mult = handler.invoke(3,5);
        Assertions.assertEquals(15, mult);
    }

    @Test
    void minusTest() {
        handler = new MinusOperationHandler();
        int minus = handler.invoke(10,6);
        Assertions.assertEquals(4, minus);
    }

    @Test
    void dicvideTest() {
        handler = new DivideOperationHandler();
        int divide = handler.invoke(8,4);
        Assertions.assertEquals(2, divide);
    }

    @Test
    void expoTest() {
        handler = new ExpoOperationHandler();
        int expo = handler.invoke(2,3);
        Assertions.assertEquals(8, expo);
    }
}