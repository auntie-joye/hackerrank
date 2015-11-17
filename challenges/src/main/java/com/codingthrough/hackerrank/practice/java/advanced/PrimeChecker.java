package com.codingthrough.hackerrank.practice.java.advanced;

import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import static java.lang.System.in;

/**
 * Problem Statement:
 * You are given a class Solution and its main method in the editor.
 * Your task is to create a class Prime which contains a single
 * method checkPrime so that the code prints only prime numbers as the output.
 * Please do not use method overloading!
 * Note: You may get a compile time error in this problem due to the below statement:
 * BufferedReader br=new BufferedReader(new InputStreamReader(in));
 * This was added intentionally, and you have to figure out a way to get rid of the error.
 * <p>
 * Input Format:
 * There are only five lines of input, each containing one integer.
 * <p>
 * Output Format:
 * There will be only four lines of output. Each line contains only
 * prime numbers depending upon the parameters passed to checkPrime in
 * the main method of the class Solution. In case there is no prime number,
 * then a blank line should be printed.
 * <p>
 * Sample Input:
 * 2
 * 1
 * 3
 * 4
 * 5
 * <p>
 * Sample Output:
 * 2
 * 2
 * 2 3
 * 2 3 5
 */
public class PrimeChecker {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);

            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            int n3 = sc.nextInt();
            int n4 = sc.nextInt();
            int n5 = sc.nextInt();

            Prime ob = new Prime();
            ob.checkPrime(n1);
            ob.checkPrime(n1, n2);
            ob.checkPrime(n1, n2, n3);
            ob.checkPrime(n1, n2, n3, n4, n5);

            Method[] methods = Prime.class.getDeclaredMethods();
            Set<String> set = new HashSet<>();
            boolean overload = false;
            for (Method method : methods) {
                if (set.contains(method.getName())) {
                    overload = true;
                    break;
                }
                set.add(method.getName());

            }
            if (overload) {
                throw new Exception("Overloading not allowed");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    static class Prime {
        void checkPrime(int... numbers) {
            for (int num : numbers) {
                if (isPrime(num)) {
                    System.out.print(num + " ");
                }
            }
            System.out.println();
        }

        boolean isPrime(int num) {
            if( num == 1) {
                return false;
            }

            if (num == 2) {
                return true;
            }

            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}
