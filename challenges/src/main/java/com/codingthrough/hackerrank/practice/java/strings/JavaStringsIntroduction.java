package com.codingthrough.hackerrank.practice.java.strings;

import java.util.Scanner;

/**
 * Problem Statement:
 * In this problem we will test your knowledge of Java Strings.
 * A string can be declared in following way:
 * <p>
 * String my_string="Hello World!"
 * Each elements of a string is called a character.
 * Number of characters in a string is called string length.
 * <p>
 * In this problem you wil be given two strings A and B as input.
 * They will contain only lower case english letters. You have to
 * answer the following questions:
 * <p>
 * What is the total length of string A and B?
 * Is string A lexicographically larger than than B? print "Yes" or "No".
 * Make first letter of both the strings uppercase and print them in a single line separated by a space.
 * [Note: Lexicographic order is also known as alphabetic order dictionary order.
 * So "ball" is smaller than "cat", "dog" is smaller than "dorm" and "dogg". ]
 * <p>
 * Sample Input:
 * hello
 * java
 * Sample Output:
 * 9
 * No
 * Hello Java
 */
public class JavaStringsIntroduction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        System.out.println(a.length() + b.length());
        System.out.println(a.compareTo(b) > 0 ? "Yes" : "No");
        System.out.println(capitalize(a) + " " + capitalize(b));
    }

    private static String capitalize(String s) {
        return s.substring(0, 1).toUpperCase() + s.substring(1);
    }
}
