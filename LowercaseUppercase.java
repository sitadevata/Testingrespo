package com.company;

import java.io.InputStreamReader;
import java.util.Scanner;

public class LowercaseUppercase {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(new InputStreamReader(System.in));
        Character inputChar = scanner.nextLine().charAt(0);
        scanner.close();
        if(inputChar >= 'A' && inputChar <= 'Z') {
            System.out.println("Entered character is in UPPERCASE : " + inputChar);
        } else if(inputChar >= 'a' && inputChar <= 'z') {
            System.out.println("Entered character is in lowercase : " + inputChar);
        } else {
            System.out.println("Entered character is not an alphabet.");
        }
    }
}
