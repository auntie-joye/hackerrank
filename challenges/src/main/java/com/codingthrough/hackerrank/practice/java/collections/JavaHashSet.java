package com.codingthrough.hackerrank.practice.java.collections;

import java.util.HashSet;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;

/**
 * Problem Statement:
 * In computer science, a set is an abstract data type
 * that can store certain values, without any particular
 * order, and no repeated values(Wikipedia). {1,2,3} is
 * an example of a set, but {1,2,2} is not a set. Today you
 * will learn how to use sets in java by solving this problem.
 * You are given n pairs of strings. Two pairs (a,b) and (c,d)
 * are identical if a=c and b=d. That also implies (a,b) is not
 * same as (b,a). After taking each pair as input, you need to
 * print number of unique pairs you currently have.
 * Note: Brute force solution will not earn full points.
 * <p>
 * Input Format:
 * In the first line, there will be an integer T denoting number
 * of pairs. Each of the next T lines will contain two strings separated by a single space.
 * <p>
 * Constraints:
 * 1<=T<=100000
 * Length of each string is at most 5 and will consist lower case letters only.
 * The test cases were generated randomly.
 * <p>
 * Output Format:
 * Print T lines. In the ith line, print number of unique pairs you have after taking ith pair as input.
 * <p>
 * Sample Input:
 * 5
 * john tom
 * john mary
 * john tom
 * mary anna
 * mary anna
 * <p>
 * Sample Output:
 * 1
 * 2
 * 2
 * 3
 * 3
 * <p>
 * Explanation:
 * After taking the first input, you have only one pair: (john,tom)
 * After taking the second input, you have two pairs: (john, tom) and (john, mary)
 * After taking the third input, you still have two unique pairs.
 * After taking the fourth input, you have three unique pairs: (john,tom), (john, mary) and (mary, anna)
 * After taking the fifth input, you still have three unique pairs.
 */
public class JavaHashSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Set<Pair> set = new HashSet<>();
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            String left = sc.next();
            String right = sc.next();

            set.add(new Pair(left, right));
            System.out.println(set.size());
        }
    }

    static class Pair {
        String left;
        String right;

        Pair(String left, String right) {
            this.left = left;
            this.right = right;
        }

        @Override
        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (other == null || getClass() != other.getClass()) {
                return false;
            }

            Pair pair = (Pair) other;

            return this.left.equals(pair.left) && this.right.equals(pair.right);
        }

        @Override
        public int hashCode() {
            return Objects.hash(left, right);
        }
    }
}
