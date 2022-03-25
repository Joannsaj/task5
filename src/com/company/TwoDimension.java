package com.company;

public class TwoDimension {
    public static void main(String[] args) {
        int row, col, sum=0;
        int table [][] = new int [10][10];

        for(row=0; row< 10; row++){
            for(col=0; col<10; col++){
                table[col][col]=col;
                System.out.print(table[row][col] + " ");
                if (row==col)
                    sum += table[row][col];

            }
            System.out.println();
        }
        System.out.println("The sum of the diagonal is " + sum);
    }
}
