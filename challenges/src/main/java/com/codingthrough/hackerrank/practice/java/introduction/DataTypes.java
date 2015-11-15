package com.codingthrough.hackerrank.practice.java.introduction;

import java.util.Scanner;

/**
 * Problem Statement
 * <p>
 * Java has 8 Primitive Data Types; they are char, boolean, byte, short,
 * int, long, float, and double. In this problem we are only concerned
 * about integer datatypes used to hold integer values (byte, short, int, long).
 * Let's take a closer look at them:
 * <p>
 * byte data type is an 8-bit signed integer.
 * short data type is an 16-bit signed integer.
 * int data type is an 32-bit signed integer.
 * long data type is an 64-bit signed integer.
 * <p>
 * Given an integer number, you have to determine which of these datatypes you
 * can use to store that number. If there are multiple suitable datatypes, list
 * them all in the order above.
 * <p>
 * To make the problem easier, some part of the code is already provided in the editor.
 * <p>
 * Input Format
 * <p>
 * The first line will contain an integer T, which denotes the number of inputs
 * that will follow. Each of the next T lines will contain an integer n. The number
 * can be arbitrarily large or small!
 * <p>
 * Output Format
 * <p>
 * For each n, list all the datatypes it can be fitted into ordered by the size of
 * the datatype. If it can't be fitted into any of these datatypes, print "n can't
 * be fitted anywhere." See the sample output for the exact formatting.
 * <p>
 * Sample Input
 * <p>
 * 5
 * -150
 * 150000
 * 1500000000
 * 213333333333333333333333333333333333
 * -100000000000000
 * Sample Output
 * <p>
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
 * <p>
 * -150 can be fitted in a short or in an int or in a long.
 * 213333333333333333333333333333333333 is way too large to fit in any datatypes mentioned in the problem statement.
 */
public class DataTypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            if (scanner.hasNextLong()) {
                long value = scanner.nextLong();
                System.out.println(value + " can be fitted in:");
                tryFitIn(value, Byte.MIN_VALUE, Byte.MAX_VALUE, "byte");
                tryFitIn(value, Short.MIN_VALUE, Short.MAX_VALUE, "short");
                tryFitIn(value, Integer.MIN_VALUE, Integer.MAX_VALUE, "int");
                tryFitIn(value, Long.MIN_VALUE, Long.MAX_VALUE, "long");
            } else {
                System.out.println(scanner.next() + " can't be fitted anywhere.");
            }
        }
    }

    private static void tryFitIn(long value, long min, long max, String type) {
        if (value >= min && value <= max) {
            System.out.println("* " + type);
        }
    }
}
