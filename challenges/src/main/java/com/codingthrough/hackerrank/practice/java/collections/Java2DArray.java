package com.codingthrough.hackerrank.practice.java.collections;

import java.util.Scanner;

/**
 * Problem Statement:
 * You are given a 6?6 2D array. An hourglass in
 * an array is a portion shaped like this:
 * <p>
 * a b c
 * d
 * e f g
 * For example, if we create an hourglass using the
 * number 1 within an array full of zeros, it may look like this:
 * <p>
 * 1 1 1 0 0 0
 * 0 1 0 0 0 0
 * 1 1 1 0 0 0
 * 0 0 0 0 0 0
 * 0 0 0 0 0 0
 * 0 0 0 0 0 0
 * Actually there are many hourglasses in the array
 * above. The three leftmost hourglasses are the following:
 * <p>
 * 1 1 1     1 1 0     1 0 0
 * 1         0         0
 * 1 1 1     1 1 0     1 0 0
 * The sum of an hourglass is the sum of all the numbers
 * within it. The sum for the hourglasses above are 7, 4, and 2, respectively.
 * <p>
 * In this problem you have to print the largest sum among
 * all the hourglasses in the array.
 * <p>
 * Input Format:
 * There will be exactly 6 lines, each containing 6 integers
 * separated by spaces. Each integer will be between ?9 and 9 inclusive.
 * <p>
 * Output Format:
 * Print the answer to this problem on a single line.
 * <p>
 * Sample Input:
 * 1 1 1 0 0 0
 * 0 1 0 0 0 0
 * 1 1 1 0 0 0
 * 0 0 2 4 4 0
 * 0 0 0 2 0 0
 * 0 0 1 2 4 0
 * <p>
 * Sample Output:
 * 19
 * <p>
 * Explanation
 * The hourglass which has the largest sum is:
 * 2 4 4
 * 2
 * 1 2 4
 */
public class Java2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r = 6, c = 6;
        int a[][] = new int[r][r];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < r - 2; i++) {
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
