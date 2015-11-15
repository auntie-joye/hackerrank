package com.codingthrough.hackerrank.practice.java.introduction;

import java.util.Scanner;

/**
 * Problem Statement:
 * <p>
 * Using "if-else" you can perform decision making in Java. This problem
 * will test your knowledge on "if-else" statements.
 * <p>
 * Given an integer N as input, check the following:
 * <p>
 * If N is odd, print "Weird".
 * If N is even and, in between the range of 2 and 5(inclusive), print "Not Weird".
 * If N is even and, in between the range of 6 and 20(inclusive), print "Weird".
 * If N is even and N>20, print "Not Weird".
 * We given you partially completed code in the editor, complete it to solve the problem.
 * <p>
 * Input Format:
 * <p>
 * There is a single line of input: integer N.
 * <p>
 * Constraints:
 * 1?N?100
 * Output Format
 * <p>
 * Print "Weird" if the number is weird. Otherwise, print "Not Weird". Do not print the quotation marks.
 * <p>
 * Sample Input 1
 * <p>
 * 3
 * Sample Output 1
 * <p>
 * Weird
 * Sample Input 2
 * <p>
 * 24
 * Sample Output 2
 * <p>
 * Not Weird
 */
public class JavaIfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        String answer = "Weird";

        if (v % 2 == 0 && ((v >= 2 && v <= 5) || (v > 20))) {
            answer = "Not Weird";
        }

        System.out.println(answer);
    }
}
