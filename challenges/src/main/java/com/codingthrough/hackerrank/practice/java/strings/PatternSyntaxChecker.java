package com.codingthrough.hackerrank.practice.java.strings;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/**
 * Problem Statement:
 * Using Regex, we can easily match or search for patterns
 * in a text. Before searching for a pattern, we have to
 * specify one using some well-defined syntax.
 * <p>
 * In this problem, you are given a pattern. You have to
 * check whether the syntax of the given pattern is valid.
 * <p>
 * Note: In this problem, a regex is only valid if you can
 * compile it using the Pattern.compile method.
 * <p>
 * Input Format:
 * The first line of input contains an integer N, denoting
 * the number of test cases. The next N lines contain a string
 * of any printable characters representing the pattern of a regex.
 * <p>
 * Output Format:
 * For each testcase, print "Valid" if the syntax of the given
 * pattern is correct. Otherwise, print "Invalid". Do not print
 * the quotes.
 * <p>
 * Sample Input:
 * 3
 * ([A-Z])(.+)
 * [AZ[a-z](a-z)
 * batcatpat(nat
 * <p>
 * Sample Output:
 * Valid
 * Invalid
 * Invalid
 */
public class PatternSyntaxChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < t; i++) {
            String regex = sc.nextLine();

            try {
                Pattern.compile(regex);
                System.out.println("Valid");
            } catch (PatternSyntaxException e) {
                System.out.println("Invalid");
            }
        }
    }
}
