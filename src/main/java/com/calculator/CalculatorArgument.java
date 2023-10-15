package com.calculator;

public class CalculatorArgument {
    public static void run(String[] args) {
        int firstNumber = Integer.parseInt(args[0]);
        String sign = args[1];
        int secondNumber = Integer.parseInt(args[2]);

        int result = switch (sign) {
            case "+" -> firstNumber + secondNumber;
            case "-" -> firstNumber - secondNumber;
            case "*" -> firstNumber * secondNumber;
            case "/" -> firstNumber / secondNumber;
            default -> 0;
        };

        System.out.println(result);
    }
}
