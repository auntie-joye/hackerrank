package com.codingthrough.hackerrank.practice.java.introduction;

import java.util.Scanner;

/**
 * Problem Statement:
 * In computing, End Of File (commonly abbreviated EOF) is a
 * condition in a computer operating system where no more data
 * can be read from a data source. (Wikipedia)
 * Sometimes you don't know how many lines are there in a file
 * and you need to read the file until EOF or End-of-file. In
 * this problem you need to read a file until EOF and print the
 * contents of the file. You must take input from stdin(System.in).
 * <p>
 * Hints: One way to do this is to use hasNext() function in java
 * Scanner class.
 * <p>
 * Input Format:
 * Each line will contain a non-empty string. Read until EOF.
 * <p>
 * Output Format:
 * For each line, print the line number followed by a single space
 * and the line content.
 * <p>
 * Sample Input:
 * Hello world
 * I am a file
 * Read me until end-of-file.
 * Sample Output:
 * 1 Hello world
 * 2 I am a file
 * 3 Read me until end-of-file.
 */
public class JavaEndOfFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int lines = 0;
        while (sc.hasNext()) {
            System.out.println(++lines + " " + sc.nextLine());
        }
    }
}
