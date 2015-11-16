package com.codingthrough.hackerrank.practice.java.introduction;

import java.util.Scanner;

/**
 * Problem Statement:
 * Java System.out.printf function allows you to print
 * formatted output. This problem will test your knowledge
 * on this topic.
 * <p>
 * Take exactly 3 lines of input. Each line consists of a
 * string and an integer. Suppose this is the sample input:
 * <p>
 * java 100
 * cpp 65
 * python 50
 * The strings will have at most 10 alphabetic characters
 * and the integers will range between 0 to 999.
 * <p>
 * In each line of output there should be two columns. The
 * string should be in the first column and the integer in
 * the second column. This is the output for the input above:
 * <p>
 * ================================
 * java           100
 * cpp            065
 * python         050
 * ================================
 * The first column should be left justified using exactly
 * 15 characters. The integer of the second column should
 * have exactly 3 digits. If the original input has less than
 * 3 digits, you should pad with zeros to the left.
 * <p>
 * To make the problem easier, some part of the solution is
 * already given in the editor, just complete the remaining parts.
 */
public class JavaOutputFormatting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String s = sc.next();
            int v = sc.nextInt();
            System.out.printf("%-15s%03d", s, v);
            System.out.println();
        }
        System.out.println("================================");

    }
}
