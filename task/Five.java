package com.task;

import java.util.Scanner;

public class Five {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //get the amount from the user
        System.out.println("Enter the purchased amount::");
        float amount = input.nextInt();

        //to check whether a person get the discount or not
        if(amount>=1000)
            System.out.print("payable amount is " + amount*0.8f);
        else if(amount>500 && amount<1000)
            System.out.print("payable amount is " + amount*0.9f);
        else
            System.out.print("No discount applied" + " payable amount is " + amount);

    }
}
