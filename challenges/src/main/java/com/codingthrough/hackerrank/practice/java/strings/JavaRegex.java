package com.codingthrough.hackerrank.practice.java.strings;

import java.util.Scanner;

/**
 * Problem Statement:
 * Write a class called myRegex which will contain a string pattern.
 * You need to write a regular expression and assign it to the pattern
 * such that it can be used to validate an IP address. Use the following
 * definition of an IP address:
 * <p>
 * IP address is a string in the form "A.B.C.D", where the value of A,
 * B, C, and D may range from 0 to 255. Leading zeros are allowed.
 * The length of A, B, C, or D can't be greater than 3.
 * Some valid IP address:
 * 000.12.12.034
 * 121.234.12.12
 * 23.45.12.56
 * <p>
 * Some invalid IP address:
 * 000.12.234.23.23
 * 666.666.23.23
 * .213.123.23.32
 * 23.45.22.32.
 * I.Am.not.an.ip
 * <p>
 * In this problem you will be provided strings containing any combination of
 * ASCII characters. You have to write a regular expression to find the valid IPs.
 * <p>
 * Sample Input:
 * 000.12.12.034
 * 121.234.12.12
 * 23.45.12.56
 * 00.12.123.123123.123
 * 122.23
 * Hello.IP
 * <p>
 * Sample Output:
 * true
 * true
 * true
 * false
 * false
 * false
 */
public class JavaRegex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String ip = sc.next();
            System.out.println(ip.matches(new myRegex().pattern));
        }

    }

    private static class myRegex {
        String pattern = "([01]?\\d\\d?|2[0-4]\\d|25[0-5])(\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])){3}";
    }
}
