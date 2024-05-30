package com.task;

import java.util.Scanner;

public class Two {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Ask the user to get the input
        System.out.println("Enter a number::");
        int num = input.nextInt();

        //To check whether a given number is positive or negative
        if (num >= 0) System.out.print("Positive");
        else System.out.print("Negative");

        //other method to check whether the given number is positive or negative
        //Conditional operator
//        String res = (num>=0)?"Positive":"Negative";
//        System.out.print(res);
    }
}
