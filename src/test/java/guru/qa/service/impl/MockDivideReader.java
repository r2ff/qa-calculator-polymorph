package guru.qa.service.impl;

import guru.qa.service.Operation;
import guru.qa.service.Reader;

public class MockDivideReader implements Reader {
    @Override
    public int readFirstArg() {
        return 8;
    }

    @Override
    public int readSecondArg() {
        return 2;
    }

    @Override
    public Operation readMathOperation() {
        return Operation.DIVIDE;
    }
}
