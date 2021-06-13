package guru.qa.service.impl;

import guru.qa.service.Operation;
import guru.qa.service.Reader;

public class MockExpReader implements Reader {
    @Override
    public int readFirstArg() {
        return 2;
    }

    @Override
    public int readSecondArg() {
        return 3;
    }

    @Override
    public Operation readMathOperation() {
        return Operation.EXPO;
    }
}
