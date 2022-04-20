package com.company;

import java.util.Scanner;

public class Task3 {
    public void calculate() {
        System.out.println("Task 3");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input a number:");
        int input = scanner.nextInt();

        for (int i = 1; i <= input; i++) {
            if (input % i == 0) {
                System.out.println(i);
            }
        }
    }

    // Write a program that takes an integer from the user
    // and prints all its divisors in the console, each divisor in seperate line.
    // For example, for the number 21, the program should write in the console
    // the numbers: 1, 3, 7, 21 (in new line each)
    // Get the data from the user in the console using the Scanner class.
}
