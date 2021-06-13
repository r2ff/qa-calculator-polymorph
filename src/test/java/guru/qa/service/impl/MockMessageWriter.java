package guru.qa.service.impl;

import guru.qa.service.Writer;

public class MockMessageWriter implements Writer {
    @Override
    public String handleString(String inputString) {
        return inputString;
    }
}
