package com.codingthrough.hackerrank.practice.java.collections;

import java.util.Scanner;

/**
 * Problem Statement:
 * Sometimes it's better to use dynamic size arrays. Java's Arraylist
 * can provide you this feature. Try to solve this problem using Arraylist.
 * You are given n lines. In each line there are zero or more integers.
 * You need to answer a few queries where you need to tell the number located in yth position of xth line.
 * Take your input from System.in.
 * <p>
 * Input Format:
 * The first line has an integer n. In each of the next n lines there will
 * be an integer d denoting number of integers on that line and then there
 * will be d space-separated integers. In the next line there will be an integer
 * q denoting number of queries. Each query will consist of two integers x and y.
 * <p>
 * Constraints:
 * 1<=n<=20000
 * 0<=d<=50000
 * 1<=q<=1000
 * 1<=x,y<=n
 * <p>
 * Each number will fit in signed integer.
 * Total number of integers in n lines will not cross 100000.
 * <p>
 * Output Format:
 * In each line, output the number located in yth position of xth line.
 * If there is no such position, just print "ERROR!"
 * <p>
 * Sample Input:
 * 5
 * 5 41 77 74 22 44
 * 1 12
 * 4 37 34 36 52
 * 0
 * 3 20 22 33
 * 5
 * 1 3
 * 3 4
 * 3 1
 * 4 3
 * 5 5
 * <p>
 * Sample Output:
 * 74
 * 52
 * 37
 * ERROR!
 * ERROR!
 */
public class JavaArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] a = new int[n][];

        for (int i = 0; i < n; i++) {
            int d = sc.nextInt();
            a[i] = new int[d];

            for (int j = 0; j < d; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int l = sc.nextInt();
            int p = sc.nextInt();

            if (l < 1 || l > n || p < 1 || p > a[l-1].length) {
                System.out.println("ERROR!");
            } else {
                System.out.println(a[l-1][p-1]);
            }
        }
    }
}
