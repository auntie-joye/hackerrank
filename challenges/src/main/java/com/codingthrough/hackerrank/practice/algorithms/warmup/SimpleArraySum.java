package com.codingthrough.hackerrank.practice.algorithms.warmup;

import java.util.Scanner;

/**
 * Problem Statement:
 * You are given an array of integers of size N. Can you
 * find the sum of the elements in the array?
 * <p>
 * Input:
 * The first line of input consists of an integer N. The
 * next line contains N space-separated integers representing the array elements.
 * <p>
 * Sample:
 * 6
 * 1 2 3 4 10 11
 * <p>
 * Output:
 * Output a single value equal to the sum of the elements in the array.
 * <p>
 * For the sample above you would just print 31 since 1+2+3+4+10+11=31.
 */
public class SimpleArraySum {
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
