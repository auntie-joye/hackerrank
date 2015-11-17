package com.codingthrough.hackerrank.practice.java.exceptionhandling;

import java.util.Scanner;

/**
 * Problem Statement:
 * Create a class myCalculator which consists of a single method
 * power(int,int). This method takes two integers, n and p, as
 * parameters and finds np. If either n or p is negative, then
 * the method must throw an exception which says "n and p should be non-negative".
 * <p>
 * Please read the partially completed code in the editor and
 * complete it. Your code mustn't be public.
 * <p>
 * No need to worry about constraints, there won't be any overflow
 * if your code is correct.
 * <p>
 * Sample Input:
 * 3 5
 * 2 4
 * -1 -2
 * -1 3
 * <p>
 * Sample Output:
 * 243
 * 16
 * java.lang.Exception: n and p should be non-negative
 * java.lang.Exception: n and p should be non-negative
 */
public class JavaExceptionHandling2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int n = sc.nextInt();
            int p = sc.nextInt();

            myCalculator calculator = new myCalculator();
            try {
                System.out.println(calculator.power(n, p));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    static class myCalculator {
        int power(int n, int p) throws Exception {
            if (n < 0 || p < 0) {
                throw new Exception("n and p should be non-negative");
            }

            return (int) Math.pow(n, p);
        }
    }
}
