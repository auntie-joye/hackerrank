package com.codingthrough.hackerrank.practice.java.introduction;

import java.util.Scanner;

/**
 * Problem Statement:
 * <p>
 * In this problem you will test your knowledge of Java loops.
 * Given three integers a, b, and n, output the following series:
 * <p>
 * a+20b,a+20b+21b,......,a+20b+21b+...+2n?1b
 * Input Format
 * <p>
 * The first line will contain the number of test cases t.
 * Each of the next t lines will have three integers, a, b, and n.
 * <p>
 * Constraints:
 * <p>
 * 0?a,b?50
 * 1?n?15
 * Output Format:
 * <p>
 * Print the answer to each test case in separate lines.
 * <p>
 * Sample Input:
 * <p>
 * 2
 * 0 2 10
 * 5 3 5
 * Sample Output:
 * <p>
 * 2 6 14 30 62 126 254 510 1022 2046
 * 8 14 26 50 98
 * Explanation
 * <p>
 * In the first case:
 * <p>
 * 1st term=0+1*2=2
 * 2nd term=0+1*2+2*2=6
 * 3rd term=0+1*2+2*2+4*2=14
 * and so on.
 */
public class JavaLoops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            for (int j = 0; j < n; j++) {
                a += b;
                System.out.print(a + " ");
                b *= 2;
            }
            System.out.println();
        }
    }
}
