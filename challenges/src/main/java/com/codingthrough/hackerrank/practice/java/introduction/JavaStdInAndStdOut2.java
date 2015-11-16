package com.codingthrough.hackerrank.practice.java.introduction;

import java.util.Scanner;

/**
 * Problem Statement:
 * In most of the problems in Hackerrank, you need to
 * read input from stdin or standard input and write your output in stdout or standard output.
 * <p>
 * One way to take input from stdin is to use Scanner
 * class and reading from System.in. Alternatively, you can use BufferedReader class.
 * <p>
 * You can write your output to stdout simply using System.out.println function.
 * <p>
 * In this problem you just need to read the inputs from stdin and print them in stdout.
 * <p>
 * Input Format:
 * There will be three lines of input. The first line will have
 * an integer. The second line will have a double number. The last
 * line will consist of a string.
 * <p>
 * Output Format:
 * Print the string in the first line, the double in the second
 * line and the integer in the third line. See the sample output for exact formatting.
 * <p>
 * To make the problem easier, some part of the code is already
 * provided in the editor. Note that Scanner's nextInt() method
 * doesn't read the last newline character of the input, you need
 * to keep this in mind if you use nextLine() after using nextInt().
 * <p>
 * Sample Input:
 * 42
 * 3.1415
 * Welcome to Hackerrank Java tutorials!
 * Sample Output:
 * String: Welcome to Hackerrank Java tutorials!
 * Double: 3.1415
 * Int: 42
 * Note: Don't worry about the precision of the double, you can simply print it
 * using System.out.println. There might be leading or trailing spaces in the string,
 * keep it exactly as it is.
 */
public class JavaStdInAndStdOut2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        double d = sc.nextDouble();
        sc.nextLine();
        String s = sc.nextLine();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
