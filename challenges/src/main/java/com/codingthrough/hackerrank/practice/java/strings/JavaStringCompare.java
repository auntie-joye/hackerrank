package com.codingthrough.hackerrank.practice.java.strings;

import java.util.Scanner;

/**
 * Problem Statement:
 * Given a string, find out the lexicographically smallest and largest substring of length k.
 * <p>
 * [Note: Lexicographic order is also known as alphabetic order dictionary order. So "ball" is
 * smaller than "cat", "dog" is smaller than "dorm". Capital letter always comes before smaller
 * letter, so "Happy" is smaller than "happy" and "Zoo" is smaller than "ball".]
 * <p>
 * Input Format:
 * First line will consist a string containing english alphabets which has at most 1000 characters.
 * 2nd line will consist an integer k.
 * <p>
 * Output Format:
 * In the first line print the lexicographically minimum substring. In the second line print the
 * lexicographically maximum substring.
 * <p>
 * Sample Input:
 * welcometojava
 * 3
 * Sample Output:
 * ava
 * wel
 * Explanation:
 * Here is the list of all substrings of length 3:
 * <p>
 * wel
 * elc
 * lco
 * com
 * ome
 * met
 * eto
 * toj
 * oja
 * jav
 * ava
 * Among them ava is the smallest and wel is the largest.
 */
public class JavaStringCompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int k = sc.nextInt();

        String min = null, max = null;
        for (String ss : splitBy(s, k)) {
            if (min == null || min.compareTo(ss) > 0) {
                min = ss;
            }

            if (max == null || ss.compareTo(max) > 0) {
                max = ss;
            }
        }

        System.out.println(min);
        System.out.println(max);
    }

    private static String[] splitBy(String s, int k) {
        int n = s.length() - k + 1;
        String[] ss = new String[n];
        for (int i = 0; i < n; i++) {
            ss[i] = s.substring(i, i + k);
        }
        return ss;
    }
}
