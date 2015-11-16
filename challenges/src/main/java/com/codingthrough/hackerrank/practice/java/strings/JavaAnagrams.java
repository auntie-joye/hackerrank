package com.codingthrough.hackerrank.practice.java.strings;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Problem Statement:
 * Two strings A and B are called anagrams if they consist same
 * characters, but may be in different orders. So the list of
 * anagrams of CAT are "CAT", "ACT" , "TAC", "TCA" ,"ATC" and "CTA.
 * <p>
 * Given two strings, print "Anagrams" if they are anagrams,
 * print "Not Anagrams" if they are not. The strings may consist
 * at most 50 english characters, the comparision should NOT be case sensitive.
 * <p>
 * This exercise will verify that you are able to sort the characters
 * of a string, or compare frequencies of characters.
 * <p>
 * Sample Input 1:
 * anagram
 * margana
 * <p>
 * Sample Output 1:
 * Anagrams
 * <p>
 * Sample Input 2:
 * anagramm
 * marganaa
 * <p>
 * Sample Output 2:
 * Not Anagrams
 */
public class JavaAnagrams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();

        System.out.println(isAnagrams(a, b) ? "Anagrams" : "Not Anagrams");
    }

    private static boolean isAnagrams(String a, String b) {
        char[] chA = a.toLowerCase().toCharArray();
        char[] chB = b.toLowerCase().toCharArray();

        Arrays.sort(chA);
        Arrays.sort(chB);

        return Arrays.equals(chA, chB);
    }
}

