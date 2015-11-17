package com.codingthrough.hackerrank.practice.java.collections;

import java.util.Scanner;

/**
 * Problem Statement:
 * Array is a very simple data structure which is used to
 * store a collection of data, for example roll number of
 * all the students in a class or name of all the countries
 * in the world. To create an array of integer that can hold
 * 10 values, you can write code like this:
 * <p>
 * int[] myList = new int[10];
 * This problem will test your knowledge on java array.
 * You are given an array of n integers. A sub-array is "Negative"
 * if sum of all the integers in that sub-array is negative. Count
 * the number of "Negative sub-arrays" in the input array.
 * <p>
 * Note: Subarrays are contiguous chunks of the main array. For
 * example if the array is {1,2,3,5} then some of the subarrays
 * are {1}, {1,2,3}, {2,3,5}, {1,2,3,5} etc. But {1,2,5} is not
 * an subarray as it is not contiguous.
 * <p>
 * Input Format:
 * The first line consists an integer n. The next line will contain n
 * space separated integers. Value of n will be at most 100. The numbers i
 * n the array will range between -10000 to 10000.
 * <p>
 * Output Format:
 * Print the answer to the problem.
 * <p>
 * Sample Input:
 * 5
 * 1 -2 4 -5 1
 * Sample Output:
 * 9
 * <p>
 * Explanation:
 * These are the ranges of the 9 negative subarrays in this sample:
 * <p>
 * [0:1]
 * [0:3]
 * [0:4]
 * [1:1]
 * [1:3]
 * [1:4]
 * [2:3]
 * [3:3]
 * [3:4]
 * Assume that the index is 0 based.
 */
public class Java1DArrayEasy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += a[k];
                }
                if (sum < 0) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
