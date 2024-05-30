package com.task;

import java.util.Scanner;

public class Three {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number::");
        int num = input.nextInt();
        int sum=0;

        //logic for reverse a given number
        while(num!=0){   //Run the loop until num becomes zero
            int rem = num%10;  //to get the last digit
            sum = sum*10 + rem;
            num/=10;  //To get the number except the rem
        }

        System.out.print("Reversed number for a given number is " + sum);
    }
}
