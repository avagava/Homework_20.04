package com.company;

import java.util.Scanner;

public class Task2 {
    public void calculate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Task 2");
        System.out.println("Please input a number");
        int inputnumbers = scanner.nextInt();

        int [] numbers = new int[inputnumbers];
        int counter = 0;
        int input;

        do {
            System.out.println("Input a number to add (input 0 to calculate)");
            input = scanner.nextInt();

            if (input == 0) {
                break;
            }
            numbers[counter++] = input;
        } while (input != 0 && counter < inputnumbers);

        int max = numbers[0];
        int min = numbers[0];
        double sum;

        for (int num: numbers) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }

        sum = max + min;
        double average = sum / 2;

        System.out.println("The sum of the largest and the smallest number is " + sum);
        System.out.println("The average of both numbers is " + average);
    }

    // Write a program that retrieves integers from the user.
    // Receiving data ends with the number 0 (not included in the data).
    // Then, the program calculates the sum of the largest and smallest
    // of the given numbers and their arithmetic average and prints
    // them in the console.
    // For example, for a series of given numbers: 1, -4, 2, 17, 0,
    // the program should write in the console the numbers: {13, 6.5}
    // Get the data from the user in the console using the Scanner class.

}
