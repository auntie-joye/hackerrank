package com.codingthrough.hackerrank.practice.java.introduction;

import java.util.Scanner;

/**
 * Problem Statement:
 * In most of the HackerRank challenges, you need to read
 * input from stdin (standard input) and write your output
 * in stdout (standard output).
 * <p>
 * One way to take input from stdin is to use the Scanner
 * class and read in from System.in.
 * <p>
 * You can write your output to stdout by simply using the
 * System.out.println(String) function.
 * <p>
 * In this problem, you need to read 3 integers from stdin
 * and print them in stdout.
 * <p>
 * Sample input:
 * 42
 * 100
 * 125
 * Sample output:
 * 42
 * 100
 * 125
 */
public class JavaStdInAndStdOut1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        readAndPrintNextInt(sc);
        readAndPrintNextInt(sc);
        readAndPrintNextInt(sc);
    }

    private static void readAndPrintNextInt(Scanner sc) {
        int v = sc.nextInt();
        System.out.println(v);
    }
}
