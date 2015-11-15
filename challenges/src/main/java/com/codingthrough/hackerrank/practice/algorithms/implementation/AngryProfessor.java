package com.codingthrough.hackerrank.practice.algorithms.implementation;

import java.util.Scanner;

/**
 * Problem Statement:
 * <p>
 * The professor is conducting a course on Discrete Mathematics
 * to a class of N students. He is angry at the lack of their
 * discipline, and he decides to cancel class if there are fewer
 * than K students present after the class starts.
 * <p>
 * Given the arrival time of each student, your task is to find out
 * if the class gets cancelled or not.
 * <p>
 * Input Format:
 * <p>
 * The first line of input contains T, the number of test cases. Each
 * test case contains two lines. The first line of each test case
 * contains two space-separated integers, N and K. The next line
 * contains N space-separated integers, a1,a2,…,aN,
 * representing the arrival time of each student.
 * <p>
 * If the arrival time of a given student is a non-positive integer (ai?0),
 * then the student enters before the class starts. If the arrival time of a
 * given student is a positive integer (ai>0), the student enters after the
 * class has started.
 * <p>
 * Output Format:
 * <p>
 * For each test case, print "YES" (without quotes) if the class gets cancelled.
 * Otherwise, print "NO" (without quotes).
 * <p>
 * Constraints:
 * <p>
 * 1?T?10
 * 1?N?1000
 * 1?K?N
 * ?100?ai?100,where i?[1,N]
 * Note
 * If a student enters the class exactly when it starts (ai=0), the student is considered
 * to have entered before the class has started.
 * <p>
 * Sample Input:
 * <p>
 * 2
 * 4 3
 * -1 -3 4 2
 * 4 2
 * 0 -1 2 1
 * Sample Output:
 * <p>
 * YES
 * NO
 * Explanation:
 * <p>
 * For the first test case, K=3. The professor wants at least 3 students to be in class,
 * but there are only 2 who have arrived on time (?3 and ?1). Hence, the class gets cancelled.
 * <p>
 * For the second test case, K=2. The professor wants at least 2 students to be in class,
 * and there are 2 who have arrived on time (0 and ?1). Hence, the class does not get cancelled.
 */
public class AngryProfessor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int m = 0;
            for (int j = 0; j < n; j++) {
                int v = scanner.nextInt();
                if (v <= 0) {
                    m++;
                }
            }

            if (m >= k) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
}
