package guru.qa.service;

import java.util.Scanner;

public class Calculator {

    public void start() {
        Scanner reader = new Scanner(System.in);
        System.out.print("Введите два числа: ");
        int first = reader.nextInt();
        int second = reader.nextInt();
        System.out.print("Введите оператор (+, *): ");
        char po = reader.next().charAt(0);
        int sum;
        switch(po) {
            case '+': sum = first + second;
                break;
            case '*': sum = first * second;
                break;
            default:  System.out.printf("Ошибка! Введите правильный оператор");
                return;
        }
        System.out.print("\nРезультат:\n");
        System.out.printf(first + " " + po + " " + second + " = " + sum);
    }
}
