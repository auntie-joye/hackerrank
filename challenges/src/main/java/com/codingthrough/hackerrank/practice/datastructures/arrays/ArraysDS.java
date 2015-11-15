package com.codingthrough.hackerrank.practice.datastructures.arrays;

import java.util.Scanner;

/**
 * Problem Statement:
 * <p>
 * An array is a series of elements of the same type placed
 * in contiguous memory locations that can be individually
 * referenced by adding an index to a unique identifier.
 * <p>
 * You'll be given an array of N integers, and you have to
 * print the integers in reverse order.
 * <p>
 * Note: If you have already solved the problem "Arrays Introduction"
 * in the Introduction chapter of the C++ domain, you may skip this challenge.
 * <p>
 * Input Format:
 * <p>
 * The first line of input contains N, the number of integers.
 * The next line contains N integers separated by a space.
 * <p>
 * Constraints:
 * <p>
 * 1<=N<=1000
 * 1<=Ai<=10000, where Ai is the ith integer in the array.
 * <p>
 * Output Format
 * <p>
 * Print the N integers of the array in the reverse order on a
 * single line separated by single spaces.
 * <p>
 * Sample Input:
 * <p>
 * 4
 * 1 4 3 2
 * Sample Output:
 * <p>
 * 2 3 4 1
 */
public class ArraysDS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        for (int i = n - 1; i >= 0; i--) {
            if (i < n - 1) {
                System.out.print(" ");
            }
            System.out.print(a[i]);
        }

        System.out.println();
    }
}
