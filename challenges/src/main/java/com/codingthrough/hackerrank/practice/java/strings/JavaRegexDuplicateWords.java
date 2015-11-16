package com.codingthrough.hackerrank.practice.java.strings;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Problem Statement:
 * When we write something, it is easy to repeat words
 * by mistake. For example: Monmoy loves to to code. H
 * ere, "to" is written multiple times.
 * <p>
 * Using Regex, we can easily identify the repeated pattern
 * in a given text. In this problem, you will be given a text.
 * Your task is to identify the consecutively repeated words
 * and delete them after the first occurrence of the word.
 * <p>
 * Complete the code in the editor to solve this problem. Don't
 * modify any extra lines. You will get the wrong answer if
 * you modify more than 3 lines.
 * <p>
 * To restore the original code in the editor, create a new
 * buffer by clicking on the top-left button in the editor.
 * <p>
 * Input Format:
 * The first line of input contains an integer N, representing
 * the number of test cases. The next N lines contain a string
 * of English letters and whitespaces.
 * <p>
 * Constrains:
 * In each line, there will be at most 104 English letters and whitespaces.
 * <p>
 * 1?N?100
 * <p>
 * Output Format:
 * Print the input string after deleting the consecutive words after
 * the first occurrence of the word.
 * <p>
 * Sample Input:
 * 4
 * Goodbye bye bye world world world
 * Swapnil went went to to to his business
 * Rana is is the the best player in eye eye game
 * in inthe
 * Sample Output:
 * <p>
 * Goodbye bye world
 * Swapnil went to his business
 * Rana is the best player in eye game
 * in inthe
 */
public class JavaRegexDuplicateWords {
    public static void main(String[] args) {
        String regex = "\\b(?<word>\\w+)\\b(\\s+\\k<word>\\b)+";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < t; i++) {
            String input = sc.nextLine();
            Matcher m = pattern.matcher(input);
            while (m.find()) {
                input = input.replaceAll(m.group(), m.group("word"));
            }
            System.out.println(input);
        }
    }
}
