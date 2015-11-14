package com.codingthrough.hackerrank.practice.algorithms.warmup;

import java.util.Scanner;

/**
 * Problem Statement:
 * <p>
 * You're given an array of integers. Can you find what fraction
 * of the elements are positive numbers, negative numbers and zeroes?
 * Print the value of the fractions in decimal form with 3 decimal places.
 * <p>
 * Input Format:
 * <p>
 * The first line contains N: the size of the array.
 * The next line contains N space-separated integers A1,A2,A3,?,AN.
 * <p>
 * Output Format:
 * <p>
 * Output the three values each on a different line. The first value shows
 * the fraction of the count of positive numbers to the total numbers, the
 * second shows the fraction of negative numbers, and the third represents
 * the fraction of zeroes. Correct the fraction to 3 decimal places.
 * <p>
 * Sample Input:
 * <p>
 * 6
 * -4 3 -9 0 4 1
 * Sample Output:
 * <p>
 * 0.500
 * 0.333
 * 0.167
 */
public class PlusMinus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int pN = 0, mN = 0, zN = 0;
        for (int i = 0; i < n; i++) {
            int value = scanner.nextInt();
            if (value < 0) {
                mN++;
            } else if (value > 0) {
                pN++;
            } else {
                zN++;
            }
        }

        System.out.println(String.format("%.3f", (double) pN / n));
        System.out.println(String.format("%.3f", (double) mN / n));
        System.out.println(String.format("%.3f", (double) zN / n));
    }
}
