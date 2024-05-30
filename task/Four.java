package com.task;

import java.net.SocketOption;
import java.util.Scanner;

public class Four {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any three number::");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        //logic for check the smallest number
        if(num1<num2 && num1<num3)
            System.out.print(num1 + " is the smallest number");
        else if(num2<num1 && num2<num3)
            System.out.print(num2 + " is the smallest number");
        else
            System.out.print(num3 + " is the smallest number");

        //other simple mathematical function to find the smallest number
//        int res=Math.min(num1,Math.min(num2,num3));
//        System.out.print(res +" is the smallest number");
    }
}
