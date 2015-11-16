package com.codingthrough.hackerrank.practice.java.introduction;

import java.util.Scanner;

/**
 * Problem Statement
 * Java has 8 Primitive Data Types; they are char, boolean, byte, short,
 * int, long, float, and double. In this problem we are only concerned
 * about integer data types used to hold integer values (byte, short, int, long).
 * Let's take a closer look at them:
 * <p>
 * byte data type is an 8-bit signed integer.
 * short data type is an 16-bit signed integer.
 * int data type is an 32-bit signed integer.
 * long data type is an 64-bit signed integer.
 * <p>
 * Given an integer number, you have to determine which of these data types you
 * can use to store that number. If there are multiple suitable data types, list
 * them all in the order above.
 * <p>
 * To make the problem easier, some part of the code is already provided in the editor.
 * <p>
 * Input Format:
 * The first line will contain an integer T, which denotes the number of inputs
 * that will follow. Each of the next T lines will contain an integer n. The number
 * can be arbitrarily large or small!
 * <p>
 * Output Format:
 * For each n, list all the data types it can be fitted into ordered by the size of
 * the data type. If it can't be fitted into any of these data types, print "n can't
 * be fitted anywhere." See the sample output for the exact formatting.
 * <p>
 * Sample Input:
 * 5
 * -150
 * 150000
 * 1500000000
 * 213333333333333333333333333333333333
 * -100000000000000
 * Sample Output:
 * -150 can be fitted in:
 * * short
 * * int
 * * long
 * 150000 can be fitted in:
 * * int
 * * long
 * 1500000000 can be fitted in:
 * * int
 * * long
 * 213333333333333333333333333333333333 can't be fitted anywhere.
 * -100000000000000 can be fitted in:
 * * long
 * Explanation
 * -150 can be fitted in a short or in an int or in a long.
 * 213333333333333333333333333333333333 is way too large to fit in any data types mentioned in the problem statement.
 */
public class DataTypes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            if (sc.hasNextLong()) {
                long value = sc.nextLong();
                System.out.println(value + " can be fitted in:");
                tryFitValueIn(value, Byte.MIN_VALUE, Byte.MAX_VALUE, Byte.TYPE.toString());
                tryFitValueIn(value, Short.MIN_VALUE, Short.MAX_VALUE, Short.TYPE.toString());
                tryFitValueIn(value, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.TYPE.toString());
                tryFitValueIn(value, Long.MIN_VALUE, Long.MAX_VALUE, Long.TYPE.toString());
            } else {
                System.out.println(sc.next() + " can't be fitted anywhere.");
            }
        }
    }

    private static boolean tryFitValueIn(long value, long min, long max, String type) {
        if (value >= min && value <= max) {
            System.out.println("* " + type);
            return true;
        }
        return false;
    }
}
