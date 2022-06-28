package com.max.idea;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double num1;
        double num2;
        double result;
        char operation;


        Scanner input = new Scanner(System.in);

        System.out.println("Ввести первое число");
        num1 = input.nextDouble();

        System.out.println("Ввести второе число");
        num2 = input.nextDouble();

        System.out.println("Выбор оператора: +, -, *, или /");
        operation = input.next().charAt(0);

        switch (operation) {

            // сложение
            case '+':
                result = num1 + num2;
                System.out.println("Ответ: " + result);
                break;

            // вычитание
            case '-':
                result = num1 - num2;
                System.out.println("Ответ: " + result);
                break;

            // умножение
            case '*':
                result = num1 * num2;
                System.out.println("Ответ: " + result);
                break;

            // деление
            case '/':
                result = num1 / num2;
                System.out.println("Ответ: " + result);
                break;

            default:
                System.out.println("Нет такого оператора!");
                break;
        }


    }
}
