package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int array[] = new int[10];
        for(int i = 0; i < array.length; i++)
            array[i]= array.length-1-i;

        for(int num : array)
            System.out.println("array["+ num +"] =" + array[num]);

    }
}
