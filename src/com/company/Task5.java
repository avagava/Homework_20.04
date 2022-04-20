package com.company;

public class Task5 {
    public void calculate() {
    System.out.println("Task 5");
    int table [] = {6, 5, 4, 10, 5, 8, 3, 10, 6, 6, 6, 4, 3, 2, 8, 1, 3, 4, 7};
    int [] count = new int[100];
    int i, tmp = 0;

    System.out.println("Elements of a given array: ");
    for (i = 0; i < table.length; i++) {
        tmp = table[i];
        count[tmp]++;
        System.out.print(table[i] + " ");
        }
    System.out.println("\n");
    System.out.println("The number of occurrences of each number in a given table");

    for (i = 1; i < count.length; i++) {
        if (count[i] > 0 && count[i] == 1) {
            System.out.printf("%d occurs %d times\n",i,count[i]);
        } else if (count[i] >= 2) {
            System.out.printf("%d occurs %d times\n", i, count[i]);
        }
    }


    }

    // Write a program that counts how many times each of the numbers has
    // appeared in the prepared table and prints a summary in the console.
    // An array can contain ** only ** numbers from 1 to 10.
    //For example, for the table [6 5 4 5 10 5 8 3 10 6 6 6 4 3 2 8 1 3 4 7] ,
    // the program should write in the console the number of occurrences of each number:
    //1 - 1
    //2 - 1
    //3 - 3
    //4 - 3
    //5 - 3
    //6 - 4
    //7 - 1
    //8 - 2
    //9 - 0
    //10 - 2
    //An array containing numbers is prepared as the variable numbers.
}
