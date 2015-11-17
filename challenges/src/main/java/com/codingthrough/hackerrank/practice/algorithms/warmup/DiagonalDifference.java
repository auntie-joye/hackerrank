package com.codingthrough.hackerrank.practice.algorithms.warmup;

import java.util.Scanner;

/**
 * Problem Statement:
 * <p>
 * You are given a square matrix of size N?N.
 * Can you calculate the absolute difference
 * of the sums across the main diagonal and
 * the secondary diagonal?
 * <p>
 * Input Format:
 * <p>
 * The first line contains a single integer N.
 * The next N lines contain the rows of N integers
 * describing the matrix.
 * <p>
 * Output Format:
 * <p>
 * Output a single integer equal to the absolute
 * difference in the sums across the diagonals.
 * <p>
 * Sample Input:
 * <p>
 * 3
 * 11 2 4
 * 4 5 6
 * 10 8 -12
 * Sample Output:
 * <p>
 * 15
 * Explanation:
 * <p>
 * The main diagonal of the matrix is:
 * <p>
 * 11
 * 5
 * -12
 * Sum across the first diagonal: 11 + 5 - 12 = 4
 * <p>
 * The secondary diagonal of the matrix is:
 * <p>
 * 4
 * 5
 * 10
 * Sum across the second diagonal: 4 + 5 + 10 = 19
 * Difference: |4 - 19| = 15
 */
public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sumL = 0, sumR = 0;
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int value = sc.nextInt();
                if (i == j) {
                    sumL += value;
                }
                if (j == n - i - 1) {
                    sumR += value;
                }
            }
        }

        System.out.println(Math.abs(sumL - sumR));
    }
}
