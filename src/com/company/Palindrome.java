package com.company;

import  java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        String check;
        System.out.println("Program to check if strings are a palindrome.");
        System.out.println("Enter your string:");
        check = new Scanner(System.in).nextLine().toLowerCase();
        String reverse = new StringBuffer(check).reverse().toString();
        if (check.equals(reverse)){
            System.out.println("This is a palindrome");
        }else{
        System.out.println("This is a not palindrome");
        }
    }
}
