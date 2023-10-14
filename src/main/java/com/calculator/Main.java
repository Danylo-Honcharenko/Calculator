package com.calculator;

public class Main {
    public static void main(String[] args) {
        switch (args.length) {
            case 0 -> CalculatorApplication.run();
            case 3 -> CalculatorArgument.run(args);
            default -> System.err.println("Invalid argument value!");
        }
    }
}