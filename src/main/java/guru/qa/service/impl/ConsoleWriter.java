package guru.qa.service.impl;

import guru.qa.service.Writer;

import java.sql.SQLOutput;

public class ConsoleWriter implements Writer {


    @Override
    public String handleString(String inputString) {
        System.out.println(inputString);
        return null;
    }
}
