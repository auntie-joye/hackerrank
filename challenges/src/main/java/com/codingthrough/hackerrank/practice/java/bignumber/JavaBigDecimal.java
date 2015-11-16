package com.codingthrough.hackerrank.practice.java.bignumber;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Problem Statement:
 * Java BigDecimal class can handle arbitrary-precision
 * signed decimal numbers. Lets test your knowledge on them!
 * You are given n real numbers, sort them in descending
 * order! Read data from System.in.
 * Note: To make the problem easier, we provided you the
 * input/output part in the editor. Print the numbers as
 * they appeared in the input, don't change anything. If two
 * numbers represent numerically equivalent values, the output
 * must list them in original order of the input.
 * <p>
 * Input Format:
 * The first line will consist an integer n, each of the next n
 * lines will contain a real number. n will be at most 200. The
 * numbers can have at most 300 digits!
 * <p>
 * Output Format:
 * Print the numbers in descending orders, one number in each line.
 * <p>
 * Sample Input:
 * 9
 * -100
 * 50
 * 0
 * 56.6
 * 90
 * 0.12
 * .12
 * 02.34
 * 000.000
 * <p>
 * Sample Output:
 * 90
 * 56.6
 * 50
 * 02.34
 * 0.12
 * .12
 * 0
 * 000.000
 * -100
 */
public class JavaBigDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        String[] s = new String[n];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }

        //Write your code here
        Arrays.sort(s, (a, b) -> {
            BigDecimal dA = new BigDecimal(a);
            BigDecimal dB = new BigDecimal(b);
            return dB.compareTo(dA);
        });

        //Output
        for (int i = 0; i < n; i++) {
            System.out.println(s[i]);
        }
    }
}
