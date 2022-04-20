package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Task10 {
    public void calculate() {
        System.out.println("Task 10");
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[] {3,6,9,12,15};
        System.out.println("Please provide a multiplier: ");
        int multiplier = scanner.nextInt();

        for (int i = 1; i < array.length - 1; i++) {
            array[i] = array[i] * multiplier;
        }

        System.out.println(Arrays.toString(array));
    }

    // Write an array in which we should multiply all elements,
    // except the first and last elements, in the Array by the provided integer.
    // The method should then return a new Array with the multiplied values.
}
