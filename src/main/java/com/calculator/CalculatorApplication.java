package com.calculator;

import java.util.Scanner;

public class CalculatorApplication {
    public static void run() {
        Scanner scanner = new Scanner(System.in);
        Operation operation = new Operation();
        System.out.println("Calculator");
        System.out.println("1. Plus");
        System.out.println("2. Minus");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.println("5. Exit");
        System.out.print("Choose an action: ");
        String cin = scanner.next();

        switch (Integer.parseInt(cin)) {
            case 1 -> operation.plus();
            case 2 -> operation.minus();
            case 3 -> operation.multiply();
            case 4 -> operation.divide();
            case 5 -> System.exit(0);
            default -> System.out.println("There is no such menu item, select another menu item!");
        }
    }
}
