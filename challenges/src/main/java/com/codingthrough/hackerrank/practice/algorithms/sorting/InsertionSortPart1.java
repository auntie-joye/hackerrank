package com.codingthrough.hackerrank.practice.algorithms.sorting;

import java.util.Scanner;

/**
 * Problem Statement:
 * <p>
 * Sorting:
 * One common task for computers is to sort data. For example,
 * people might want to see all their files on a computer sorted
 * by size. Since sorting is a simple problem with many different
 * possible solutions, it is often used to introduce the study of algorithms.
 * <p>
 * Insertion Sort:
 * These challenges will cover Insertion Sort, a simple and intuitive
 * sorting algorithm. We will first start with an already sorted list.
 * <p>
 * Insert element into sorted list:
 * Given a sorted list with an unsorted number e in the rightmost cell,
 * can you write some simple code to insert e into the array so that it
 * remains sorted?
 * <p>
 * Print the array every time a value is shifted in the array until the
 * array is fully sorted. The goal of this challenge is to follow the
 * correct order of insertion sort.
 * <p>
 * Guideline: You can copy the value of e to a variable and consider
 * its cell "empty". Since this leaves an extra cell empty on the right,
 * you can shift everything over until V can be inserted. This will create
 * a duplicate of each value, but when you reach the right spot, you can
 * replace it with e.
 * <p>
 * Input Format:
 * There will be two lines of input:
 * <p>
 * Size - the size of the array
 * Arr - the unsorted array of integers
 * Output Format:
 * On each line, output the entire array every time an item is shifted in it.
 * <p>
 * Constraints:
 * 1?Size?1000
 * ?10000?e?10000,e?Arr
 * <p>
 * Sample Input:
 * <p>
 * 5
 * 2 4 6 8 3
 * Sample Output:
 * <p>
 * 2 4 6 8 8
 * 2 4 6 6 8
 * 2 4 4 6 8
 * 2 3 4 6 8
 */
public class InsertionSortPart1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        int value = a[n - 1];
        for (int i = n - 1; i >= 0; i--) {
            if (i == 0 || a[i - 1] <= value) {
                a[i] = value;
                print(a, n);
                break;
            } else {
                a[i] = a[i - 1];
                print(a, n);
            }
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
