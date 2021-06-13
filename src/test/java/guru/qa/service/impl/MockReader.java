package guru.qa.service.impl;

import guru.qa.service.Operation;
import guru.qa.service.Reader;

public class MockReader implements Reader {
    @Override
    public int readFirstArg() {
        return 1;
    }

    @Override
    public int readSecondArg() {
        return 2;
    }

    @Override
    public Operation readMathOperation() {
        return Operation.SUM;
    }
}
