package com.task;

import java.util.Scanner;

public class Six {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //get the number to print the pattern
        System.out.println("Enter a number::");
        int k = input.nextInt();
        int length = k;

        //logic for pattern printing
        for(int i=0;i<length;i++){
            for(int j=0;j<length;j++){
                if(i!=0 && j!=0 && j<=i){
                    k--;
                }
                System.out.print(k + " ");
            }
            System.out.println();
            k = length;
        }

        // another method using array
//        int[][] arr = new int[k][k];
//        for(int i=0;i<length;i++){
//            for(int j=i;j<length;j++){
//                arr[i][j] = k;
//                arr[j][i] = k;
//            }
//            k--;
//        }
//
//        for(int i=0;i<length;i++){
//            for(int j=0;j<length;j++){
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }
    }
}
