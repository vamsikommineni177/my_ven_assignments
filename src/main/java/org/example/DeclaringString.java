package org.example;

public class DeclaringString {
        public static void main(String[] args)
        {
            String s = "GeeksforGeeks";
            System.out.println("String "+ s+" is declared without using new operator so that the object will be created in string pool constant ");
            String s1 = new String("GeeksforGeeks");
            System.out.println("String " + s1+" is declared using new operator so that the memory allocation was occured in heap but not in string pool constant ");
        }
    }

