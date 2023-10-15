package com.calculator;

import java.util.Scanner;

public class Console {
    public static int inputInt(String value) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(value);
        return Integer.parseInt(scanner.next());
    }
}
