package com.calculator;

public class Operation {

    public void plus() {
        int a = Console.inputInt("a: ");
        int b = Console.inputInt("b: ");
        int result = a + b;
        System.out.println("Result: " + result);
    }

    public void minus() {
        int a = Console.inputInt("a: ");
        int b = Console.inputInt("b: ");
        int result = a - b;
        System.out.println("Result: " + result);
    }

    public void multiply() {
        int a = Console.inputInt("a: ");
        int b = Console.inputInt("b: ");
        int result = a * b;
        System.out.println("Result: " + result);
    }

    public void divide() {
        int a = Console.inputInt("a: ");
        int b = Console.inputInt("b: ");
        if (b == 0) throw new ArithmeticException("Cannot divide by 0!");
        int result = a / b;
        System.out.println("Result: " + result);
    }
}
