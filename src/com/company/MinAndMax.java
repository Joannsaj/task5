package com.company;

import java.util.Random;

public class MinAndMax {
    public static void main(String[] args) {
        int min = 100, max = 1;
        int set[] = new int[10];
        Random rnd = new Random();

        for (int i = 0; i < set.length; i++) {
            int num = rnd.nextInt(101);
            set[i] = num;

            System.out.println(num);

            if (set[i] > max) {
                max = set[i];

            }
            if (set[i]< min) {
                min = set[i];
            }
        }

        System.out.println("\nThe largest number in the set of numbers is " + max);
        System.out.println("The smallest number in the set of numbers is " + min);
    }
}
