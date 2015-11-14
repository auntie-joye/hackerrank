package com.codingthrough.hackerrank.practice.algorithms.warmup;

import java.util.Scanner;

/**
 * Problem Statement:
 * <p>
 * You are given a time in AM/PM format. Can you convert this into a 24-hour format?
 * <p>
 * Input:
 * <p>
 * Input consists of the time in the AM/PM format i.e. hh:mm:ssAM or hh:mm:ssPM
 * where 01?hh?12.
 * <p>
 * Sample: 07:05:45PM
 * <p>
 * Output:
 * <p>
 * You need to print the time in a 24-hour format i.e. hh:mm:ss
 * where 00?hh?23.
 * <p>
 * Sample output for the above input: 19:05:45
 * <p>
 * Note: Midnight is 12:00:00AM or 00:00:00. Noon is 12:00:00PM.
 */
public class TimeConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.next();

        String[] parts = input.split(":");
        int hours = Integer.valueOf(parts[0]);
        int minutes = Integer.valueOf(parts[1]);
        int seconds = Integer.valueOf(parts[2].substring(0, 2));

        if (input.contains("PM") && hours != 12) {
            hours += 12;
        }

        if (input.contains("AM") && hours == 12) {
            hours = 0;
        }

        System.out.println(String.format("%02d:%02d:%02d", hours, minutes, seconds));
    }
}
