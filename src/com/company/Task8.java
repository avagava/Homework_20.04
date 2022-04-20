package com.company;

public class Task8 {
    public void calcualte() {
        System.out.println("Task 8");
        int table[] = {1, 2, 4, 5, 6};
        int target = 6;

        System.out.println("Two integers of the array that equal to " + target);
        for (int i = 0; i < table.length - 1; i++) {
            for (int j = i + 1; j < table.length; j++) {
                if (table[i] + table[j] == target)
                    System.out.println("Pair with a given sum is " + table[i] + " and " + table[j]);
            }
        } // How to create an else statement in the loop?

    }

    //Write a Java program to find the sum of the two elements
    // of a given array which is equal to a given integer.
    // Sample array: [1,2,4,5,6]
    // Target value: 6
}
