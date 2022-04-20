package com.company;

public class Task9 {
    int[] numbers = {87, 1, 89, 2, 88, 3, 4, 90, 91, 5, 92};

    public void InsertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j;
            for (j = i; j > 0 && array [j - 1] > current; j--) {
                array[j] = array[j - 1];
            }
            array[j] = current;
        }
    }
    public void newNumbers(int[] array) {
        int counter = 1;
        int MaxCounter = 1;
        for (int i = 1; i < array.length; i++) {
            if (array[i] == (array[i -1] +1)) {
                counter = counter + 1;
                if (counter > MaxCounter) {
                    MaxCounter = counter;
                } else {
                    MaxCounter = MaxCounter;
                }
            } else {
                counter = 1;
            }
        }

        System.out.println("The array length is: " + MaxCounter);
    }

    // Write a Java program to find the length of the longest consecutive
    // elements sequence from a given unsorted array of integers.
    // Sample array: [49, 1, 3, 200, 2, 4, 70, 5] ….
    // [49, 50, 1, 3, 200, 2, 4, 70, 5, 13, 11, 12]
    // The longest consecutive elements sequence is [1, 2, 3, 4, 5],
    // therefore the program will return its length 5.
}
