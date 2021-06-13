package guru.qa.service;

import guru.qa.service.impl.MockReader;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReaderTest {

    public Reader reader = new MockReader();

    @Test
    void readerTest() {
        Assertions.assertEquals(1, reader.readFirstArg());
        Assertions.assertEquals(2, reader.readSecondArg());
        Assertions.assertEquals('+', Operation.SUM.getSymbol());
    }
}
