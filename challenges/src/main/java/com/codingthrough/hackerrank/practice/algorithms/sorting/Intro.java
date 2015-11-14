package com.codingthrough.hackerrank.practice.algorithms.sorting;

import java.util.Scanner;

/**
 * Sample Challenge:
 * This is a simple challenge to get things started. Given a
 * sorted array (ar) and a number (V), can you print the index
 * location of V in the array?
 * <p>
 * Input Format:
 * There will be three lines of input:
 * <p>
 * V - the value that has to be searched.
 * n - the size of the array.
 * ar - n numbers that make up the array.
 * Output Format:
 * Output the index of V in the array.
 * <p>
 * Constraints:
 * <p>
 * 1?n?1000
 * ?1000?V?1000,V?ar
 * It is guaranteed that V will occur in ar exactly once.
 */
public class Intro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int v = scanner.nextInt();

        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        System.out.println(indexOf(a, v));
    }

    private static int indexOf(int[] a, int v) {
        int lo = 0;
        int hi = a.length - 1;

        while (hi > lo) {
            int mid = lo + (hi - lo) / 2;

            if (a[mid] < v) {
                lo = mid + 1;
            } else {
                hi = mid;
            }
        }

        return hi;
    }
}
