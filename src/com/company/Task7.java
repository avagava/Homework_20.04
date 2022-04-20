package com.company;

public class Task7 {
    public void calcualte() {

        System.out.println("Task 7");
        int table[] = {1, 14, 23, 88, 2, 9, 33, 58};
        int max = table[0];
        int min = table[0];

        for (int num: table) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }

        int difference = (max - min);

        System.out.println("The difference between the smallest and the largest value is: " + difference);
    }

    // Write a Java program to get the difference between the largest and
    // smallest values in an array of integers. The length of the array must be 1 and above.
}
