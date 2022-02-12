package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int size1;
        int size2;
        int[][]array;
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter a size1:");
        size1=scanner.nextInt();
        System.out.print("Enter a size2:");
        size2=scanner.nextInt();
        array=new int[size1][size2];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print("Enter a number "+ i + " "+ j + ":" );
                array[i][j]=scanner.nextInt();
            }
        }
        System.out.println("List of number: ");
        for (int i = 0; i < array.length ; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        int max=array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (max<array[i][j]){
                    max=array[i][j];
                }
            }
        }
        System.out.println("Phần tử lớn nhất trong mảng là :" + max);
    }
}
