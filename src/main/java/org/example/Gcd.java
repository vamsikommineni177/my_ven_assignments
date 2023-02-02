package org.example;

class Gcd {
    static String gcd(String str1, String str2)
    {
        if (str1.length() < str2.length()){
            return gcd(str2, str1);
        }
        else if (!str1.startsWith(str2)) {
            return " No GCD ";
        }
        else if (str2.isEmpty()) {
            return str1;
        }
        else {
            return gcd(str1.substring(str2.length()), str2);
        }
    }
    static String findGCD(String arr[], int n)
    {
        String result = arr[0];

        for (int i = 1; i < n; i++) {
            result = gcd(result, arr[i]);
        }
        return result;
    }
    public static void main(String[] args)
    {
        String arr[]  = new String[] { "ababab", "ab" };
        int n = arr.length;
        System.out.println("The GCD of given strings is "+findGCD(arr, n));
    }
}