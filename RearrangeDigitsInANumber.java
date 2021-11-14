package com.company;

import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class RearrangeDigitsInANumber {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(new InputStreamReader(System.in));
        System.out.println("Enter a number whose digits you want to sort: ");
        String numberString = scanner.next();
        int number = Integer.parseInt(numberString);
        int remainder = 0;
        int [] digits = new int[numberString.length()];
        int counter = 0;
        do {
            remainder = number % 10;
            number = number / 10;
            digits[counter] = remainder;
            counter++;
        } while(number > 0);
        Arrays.sort(digits);
        for(int i = 0; i < digits.length; i++) {
            System.out.print(digits[i]);
        }
    }
}