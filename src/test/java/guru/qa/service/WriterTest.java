package guru.qa.service;

import guru.qa.service.impl.MockMessageWriter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WriterTest {
    MockMessageWriter writer = new MockMessageWriter();

    @Test
    void enterTwoNumbersMessageTest() {
        Assertions.assertEquals("Enter 2 numbers: ", writer.handleString(Messages.ENTER_TWO_NUMBERS.getS()));
    }

    @Test
    void enterOperatorMessageTest() {
        Assertions.assertEquals("Enter operator (+, *, -, /, ^): ", writer.handleString(Messages.ENTER_OPERATOR.getS()));
    }

    @Test
    void resultMessageTest() {
        Assertions.assertEquals("Result: ", writer.handleString(Messages.RESULT.getS()));
    }
}
