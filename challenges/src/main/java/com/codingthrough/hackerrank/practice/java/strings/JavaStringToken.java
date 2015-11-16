package com.codingthrough.hackerrank.practice.java.strings;

import java.util.Scanner;

/**
 * Problem Statement:
 * Given a string, find number of words in that string.
 * For this problem a word is defined by a string of one
 * or more english alphabets.
 * <p>
 * There are multiple ways to tokenize a string in java, l
 * earn how to tokenize a string in java and demonstrate your
 * skill by solving this problem!
 * <p>
 * Input Format:
 * A string not more than 400000 characters long. The string
 * can be defined by following regular expression:
 * <p>
 * [A-Za-z !,?.\_'@]+
 * That means the string will only contain english alphabets,
 * blank spaces and this characters: "!,?._'@".
 * <p>
 * Output Format:
 * In the first line, print number of words n in the string.
 * The words don't need to be unique. In the next n lines, print
 * all the words you found in the order they appeared in the input.
 * <p>
 * Sample Input:
 * He is a very very good boy, isn't he?
 * <p>
 * Sample Output:
 * 10
 * He
 * is
 * a
 * very
 * very
 * good
 * boy
 * isn
 * t
 * he
 */
public class JavaStringToken {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine().trim();
        if (s.length() > 400000) {
            return;
        }

        String[] words = s.split("[ !,?._'@]+");

        int n = 0;
        for (String word : words) {
            if (word.length() > 0) {
                n++;
            }
        }

        System.out.println(n);
        for (String word : words) {
            System.out.println(word);
        }
    }
}
