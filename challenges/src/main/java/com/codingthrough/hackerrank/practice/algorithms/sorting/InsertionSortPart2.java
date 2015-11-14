package com.codingthrough.hackerrank.practice.algorithms.sorting;

import java.util.Scanner;

/**
 * Problem Statement:
 * <p>
 * In Insertion Sort Part 1, you sorted one element into an array.
 * Using the same approach repeatedly, can you sort an entire unsorted array?
 * <p>
 * Guideline: You already can place an element into a sorted array. H
 * ow can you use that code to build up a sorted array, one element
 * at a time? Note that in the first step, when you consider an element
 * with just the first element - that is already "sorted" since there's
 * nothing to its left that is smaller.
 * <p>
 * In this challenge, don't print every time you move an element. Instead,
 * print the array after each iteration of the insertion-sort, i.e., whenever
 * the next element is placed at its correct position.
 * <p>
 * Since the array composed of just the first element is already "sorted",
 * begin printing from the second element and on.
 * <p>
 * Input Format:
 * There will be two lines of input:
 * <p>
 * s - the size of the array
 * ar - a list of numbers that makes up the array
 * Output Format:
 * On each line, output the entire array at every iteration.
 * <p>
 * Constraints:
 * 1?s?1000
 * ?10000?x?10000,x?ar
 * <p>
 * Sample Input
 * <p>
 * 6
 * 1 4 3 5 6 2
 * Sample Output
 * <p>
 * 1 4 3 5 6 2
 * 1 3 4 5 6 2
 * 1 3 4 5 6 2
 * 1 3 4 5 6 2
 * 1 2 3 4 5 6
 */
public class InsertionSortPart2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        sort(a, n);
    }

    private static void sort(int[] a, int n) {
        for (int i = 1; i < n; i++) {
            int v = a[i];
            for (int j = i; j >= 0; j--) {
                if (j == 0 || a[j - 1] <= v) {
                    a[j] = v;
                    break;
                } else {
                    a[j] = a[j - 1];
                }
            }

            print(a, n);
        }
    }

    private static void print(int[] a, int n) {
        for (int i = 0; i < n; i++) {
            if (i > 0) {
                System.out.print(" ");
            }
            System.out.print(a[i]);
        }
        System.out.println();
    }
}
