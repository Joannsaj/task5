package com.company;

import java.util.Scanner;

public class ConcatenatingStrings {

    public static void main(String[] args) {
        String firstString, secondString;
        System.out.println("Enter your first string:");
        firstString = new Scanner(System.in).nextLine();
        System.out.println("Enter your second string:");
        secondString = new Scanner(System.in).nextLine();
        System.out.println("This is the first concatenation.");
        String one = firstString.concat(secondString);
        System.out.println(one);
        System.out.println("This is the second concatenation.");
        String two = secondString.concat(firstString);
        System.out.println(two);
        System.out.println("Are the 2 concatenations equal.");
        System.out.println(one.equals(two));
    }
}
