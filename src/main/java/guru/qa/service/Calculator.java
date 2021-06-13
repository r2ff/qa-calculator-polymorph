package guru.qa.service;

import java.util.Scanner;

public class Calculator {

    private final Reader reader;

    public Calculator(Reader reader) {
        this.reader = reader;
    }

    public void start() {

        System.out.print("Введите два числа: ");
        int first = reader.readFirstArg();
        int second = reader.readSecondArg();
        System.out.print("Введите оператор (+, *): ");
        Operation po = reader.readMathOperator();
        int sum;
        switch(po) {
            case SUM: sum = sum(first, second);
                break;
            case MULT: sum = mult(first, second);
                break;
            default:  System.out.printf("Ошибка! Введите правильный оператор");
                return;
        }
        System.out.print("\nРезультат:\n");
        System.out.printf(first + " " + po.getSymbol() + " " + second + " = " + sum);
    }

    int sum(int first, int second) {
        return first + second;
    }

    int mult(int first, int second) {
        return first * second;
    }
}
