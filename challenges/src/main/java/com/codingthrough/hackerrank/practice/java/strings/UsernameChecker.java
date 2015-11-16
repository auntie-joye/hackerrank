package com.codingthrough.hackerrank.practice.java.strings;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Problem Statement:
 * Regular expressions (regexp) help us match or search
 * for patterns in strings. In this problem, you will be
 * given a username. Your task is to check whether that
 * username is valid. A valid username will have the following properties:
 * <p>
 * The username can contain alphanumeric characters and/or underscores(_).
 * The username must start with an alphabetic character.
 * 8 ? |Username| ? 30.
 * To simplify your task, we have provided a portion of the
 * code in the editor. You just need to write down the regex
 * pattern which will be used to validate the username input.
 * <p>
 * Input Format:
 * The first line of input contains an integer N, representing
 * the number of test cases. Each of the next N lines contains
 * a string that represents a username.
 * <p>
 * Constraints:
 * The username consists of any printable characters.
 * 1?N?50
 * <p>
 * Output Format:
 * For each username, output Valid if the username is valid; otherwise,
 * output Invalid.
 * <p>
 * Sample Input:
 * 4
 * alpha_naheed
 * xahidbuffon
 * nagib@007
 * 123Swakkhar
 * <p>
 * Sample Output:
 * Valid
 * Valid
 * Invalid
 * Invalid
 */
public class UsernameChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < t; i++) {
            String username = sc.nextLine();
            String regex = "^[a-zA-Z][a-zA-Z0-9_]{7,29}$";

            Pattern r = Pattern.compile(regex);
            Matcher m = r.matcher(username);

            if (m.find()) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
    }
}

