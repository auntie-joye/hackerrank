package com.codingthrough.hackerrank.practice.algorithms.warmup;

import java.util.Scanner;

/**
 * Problem Statement:
 * <p>
 * You are given an array of integers of size N. You need
 * to print the sum of the elements in the array, keeping
 * in mind that some of those integers may be quite large.
 * <p>
 * Input:
 * <p>
 * The first line of the input consists of an integer N.
 * The next line contains N space-separated integers
 * contained in the array.
 * <p>
 * Constraints:
 * 1?N?10
 * 0?A[i]?1010
 * <p>
 * Sample Input:
 * <p>
 * 5
 * 1000000001 1000000002 1000000003 1000000004 1000000005
 * Output:
 * Print a single value equal to the sum of the elements in
 * the array. In the above sample, you would print 5000000015.
 */
public class VeryBigSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long sum = 0;
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            sum += sc.nextInt();
        }

        System.out.println(sum);
    }
}
