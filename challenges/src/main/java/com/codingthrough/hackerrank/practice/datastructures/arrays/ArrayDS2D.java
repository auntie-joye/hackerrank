package com.codingthrough.hackerrank.practice.datastructures.arrays;

import java.util.Scanner;

/**
 * Problem Statement:
 * <p>
 * You are given a 2D array with dimensions 6*6. An
 * hourglass in an array is defined as a portion shaped
 * like this:
 * <p>
 * a b c
 * d
 * e f g
 * For example, if we create an hourglass using the number
 * 1 within an array full of zeros, it may look like this:
 * <p>
 * 1 1 1 0 0 0
 * 0 1 0 0 0 0
 * 1 1 1 0 0 0
 * 0 0 0 0 0 0
 * 0 0 0 0 0 0
 * 0 0 0 0 0 0
 * Actually, there are many hourglasses in the array above.
 * The three leftmost hourglasses are the following:
 * <p>
 * 1 1 1     1 1 0     1 0 0
 * 1         0         0
 * 1 1 1     1 1 0     1 0 0
 * The sum of an hourglass is the sum of all the numbers within it.
 * The sum for the hourglasses above are 7, 4, and 2, respectively.
 * <p>
 * In this problem, you have to print the largest sum among all the
 * hourglasses in the array.
 * <p>
 * Note: If you have already solved the problem "Java 2D array" in
 * the data structures chapter of the Java domain, you may skip this
 * challenge.
 * <p>
 * Input Format:
 * <p>
 * There will be exactly 6 lines of input, each containing 6 integers
 * separated by spaces. Each integer will be between -9 and 9, inclusively.
 * <p>
 * Output Format:
 * <p>
 * Print the answer to this problem on a single line.
 * <p>
 * Sample Input:
 * <p>
 * 1 1 1 0 0 0
 * 0 1 0 0 0 0
 * 1 1 1 0 0 0
 * 0 0 2 4 4 0
 * 0 0 0 2 0 0
 * 0 0 1 2 4 0
 * Sample Output:
 * <p>
 * 19
 * <p>
 * Explanation:
 * <p>
 * The hourglass possessing the largest sum is:
 * <p>
 * 2 4 4
 * 2
 * 1 2 4
 */
public class ArrayDS2D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int l = 6, c = 6;
        int[][] a = new int[l][c];

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = scanner.nextInt();
            }
        }

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < l - 2; i++) {
            for (int j = 0; j < c - 2; j++) {
                int sum = a[i][j] + a[i][j + 1] + a[i][j + 2];
                sum += a[i + 1][j + 1];
                sum += a[i + 2][j] + a[i + 2][j + 1] + a[i + 2][j + 2];

                max = Math.max(max, sum);
            }
        }

        System.out.println(max);
    }
}
