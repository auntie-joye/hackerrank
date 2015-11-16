package com.codingthrough.hackerrank.practice.java.bignumber;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Problem Statement:
 * In this problem you have to add and multiply
 * huge numbers! These numbers are so big that you
 * can't contain them in any ordinary data types like
 * long integer.
 * <p>
 * Use the power of Java's BigInteger class and solve
 * this problem.
 * <p>
 * Input Format:
 * There will be two lines containing two numbers, a and b.
 * The numbers are non-negative and can have maximum 200 digits.
 * <p>
 * Output Format:
 * Output two lines. The first line should contain a+b, and
 * the second line should contain a?b. Don't print any leading zeros.
 * <p>
 * Sample Input:
 * 1234
 * 20
 * <p>
 * Sample Output:
 * 1254
 * 24680
 * <p>
 * Explanation:
 * 1234+20=1254
 * 1234*20=24680
 */
public class JavaBigInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        BigInteger iA = new BigInteger(a);
        BigInteger iB = new BigInteger(b);

        System.out.println(iA.add(iB).toString());
        System.out.println(iA.multiply(iB).toString());
    }
}
