package org.example;

import java.util.Scanner;

public class SumOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first num");
        int a = sc.nextInt();
        System.out.println("Enter 2nd num");
        int b = sc.nextInt();
        int c = a+b;
        //int d;
        System.out.println("by adding 2 nos... the output is " + c);
    }
}
