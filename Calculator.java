package com.company;

import java.io.InputStreamReader;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(new InputStreamReader(System.in));
        do {
            System.out.println("What operation do you want perform?");
            String operation = scanner.next();
            System.out.println("Enter the FIRST value : ");
            int i = scanner.nextInt();
            System.out.println("Enter the SECOND value : ");
            int j = scanner.nextInt();
            switch (operation) {
                case "add":
                    add(i, j);
                    break;
                case "subtract":
                    subtract(i, j);
                    break;
                case "multiply":
                    multiply(i, j);
                    break;
                case "divide":
                    division(i, j);
                    break;
                default:
                    break;
            }
        } while (true);
    }
    public static void add(int i,int j){
        int result = i + j;
        System.out.println ("Sum of the entered values is : " + result);
    }
    public static void subtract(int i,int j) {
        int result = i - j;
        System.out.println("Subtraction of the entered values is : " + result);
    }
    public static void multiply(int i,int j) {
        int result = i * j;
        System.out.println("Multiplication of the entered values is : " + result);
    }
    public static void division(int i,int j) {
        int result = i / j;
        System.out.println("Division of the entered values is : " + result);
    }
}
