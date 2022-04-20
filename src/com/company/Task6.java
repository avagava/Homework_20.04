package com.company;

public class Task6 {
    public void calculate() {
        System.out.println("Task 6");
        int table[] = {7, 7, 8, 3, 1, 1, 9, 4, 4, 10};
        System.out.println("Duplicate values of an array: ");

        for (int i = 0; i < table.length; i++) {
            for (int j = i + 1; j < table.length; j++) {
                if (table[i] == table[j])
                    System.out.println(table[j]);
            }
        }

    }

    //Write a Java program to find the duplicate values of an array of integer values.
}
