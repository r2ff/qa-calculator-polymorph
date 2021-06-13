package guru.qa.service.impl;

import guru.qa.service.Operation;
import guru.qa.service.Reader;

public class MockMinusReader implements Reader {
    @Override
    public int readFirstArg() {
        return 13;
    }

    @Override
    public int readSecondArg() {
        return 5;
    }

    @Override
    public Operation readMathOperation() {
        return Operation.MINUS;
    }
}
