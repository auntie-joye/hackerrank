package com.codingthrough.hackerrank.practice.java.strings;

import java.util.Scanner;

/**
 * Problem Statement:
 * A palindrome is a word, phrase, number, or other sequence
 * of characters which reads the same backward or forward.(Wikipedia)
 * Given a string A, print "Yes" if it is a palindrome, print
 * "No" otherwise. The strings will consist lower case english
 * letters only. The strings will have at most 50 characters.
 * <p>
 * Some examples of palindromes are "madam", "anna", "reviver".
 * <p>
 * Sample Input:
 * madam
 * Sample Output:
 * Yes
 */
public class JavaStringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String r = reverse(s);

        System.out.println(r.equals(s) ? "Yes" : "No");
    }

    private static String reverse(String s) {
        char[] ch = s.toCharArray();
        for (int i = 0; i < ch.length / 2; i++) {
            int j = ch.length - i - 1;

            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
        }

        return new String(ch);
    }

    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String r = new StringBuilder(s).reverse().toString();

        System.out.println(r.equals(s) ? "Yes" : "No");
    }*/
}
