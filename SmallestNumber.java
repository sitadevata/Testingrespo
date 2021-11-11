package com.company;

import java.io.InputStreamReader;
import java.util.Scanner;

public class SmallestNumber {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(new InputStreamReader(System.in));
        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());
        int number3 = Integer.parseInt(scanner.nextLine());
        int number4 = Integer.parseInt(scanner.nextLine());
        scanner.close();
        int smallest = number1;

        if(number2 < smallest) {
            smallest = number2;
        } else if(number3 < smallest) {
            smallest = number3;
        } else if(number4 < smallest) {
            smallest = number4;
        }
        System.out.println("Smallest number is: " + smallest);
    }
}
