package org.example;

import java.util.Scanner;

public class MaxOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    //System.in is a standard input stream
        System.out.print("Enter first number- ");
        int a = sc.nextInt();//taking input a from user
        System.out.print("Enter second number- ");
        int b = sc.nextInt();//taking input a from user
        if (a > b) {
            System.out.println("The max is a " + a);
        } else
        {
            System.out.println("Max is b " + b);
        }
    }
}
