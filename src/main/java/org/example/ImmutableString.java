package org.example;

public class ImmutableString {
        public static void main(String[] args)
        {
            String s = "Sachin";
            s.concat(" Tendulkar");
            System.out.println("Even though we append tendulkar using concat().... due to its immutable behaviour \n so the string is "+s);
        }
    }

