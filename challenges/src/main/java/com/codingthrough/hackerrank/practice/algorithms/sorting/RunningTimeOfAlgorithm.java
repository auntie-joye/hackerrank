package com.codingthrough.hackerrank.practice.algorithms.sorting;

import java.util.Scanner;

/**
 * Challenge:
 * Can you modify your previous Insertion Sort implementation to
 * keep track of the number of shifts it makes while sorting?
 * The only thing you should print is the number of shifts made
 * by the algorithm to completely sort the array. A shift occurs
 * when an element's position changes in the array. Do not shift
 * an element if it is not necessary.
 * <p>
 * Input Format:
 * The first line contains N, the number of elements to be sorted.
 * The next line contains N integers a[1], a[2], ..., a[N].
 * <p>
 * Output Format:
 * Output the number of shifts it takes to sort the array.
 * <p>
 * Constraints:
 * 1?N?1001
 * ?10000?x?10000,x?a
 * Sample Input
 * <p>
 * 5
 * 2 1 3 1 2
 * Sample Output:
 * <p>
 * 4
 * Explanation:
 * The first 1 is shifted once. The 3 stays where it is. The next 1
 * gets shifted twice. The final 2 gets shifted once. Hence, the total
 * number of shifts is 4.
 */
public class RunningTimeOfAlgorithm {
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
        int shift = 0;

        for (int i = 1; i < n; i++) {
            int v = a[i];
            for (int j = i; j >= 0; j--) {
                if (j == 0 || a[j - 1] <= v) {
                    a[j] = v;
                    break;
                } else {
                    a[j] = a[j - 1];
                    shift++;
                }
            }
        }

        System.out.println(shift);
    }
}
