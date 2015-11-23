package com.codingthrough.hackerrank.practice.datastructures.stacks;

import java.util.Scanner;
import java.util.Stack;

/**
 * Problem Statement:
 * There are N buildings in a certain one-dimensional landscape. Each
 * building has a height given by hi,i?[1,N]. If you join K adjacent
 * buildings, they will form a solid rectangle of area K?min(hi,hi+1,…,hi+k?1).
 * <p>
 * Given N buildings, find the greatest such solid area formed by
 * consecutive buildings.
 * <p>
 * Input Format:
 * The first line contains N, the number of buildings altogether.
 * The second line contains N space-separated integers, each representing
 * the height of a building.
 * <p>
 * Constraints:
 * 1?N?105
 * 1?hi?106
 * <p>
 * Output Format:
 * One integer representing the maximum area of
 * rectangle formed.
 * <p>
 * Sample Input:
 * 5
 * 1 2 3 4 5
 * <p>
 * Sample Output:
 * 9
 */
public class LargestRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int hits[] = new int[n + 1];
        for (int i = 0; i < n; i++) {
            hits[i] = sc.nextInt();
        }
        hits[n] = 0;

        int i = 0;
        int maxArea = 0;
        Stack<Integer> stack = new Stack<>();
        while (i <= n) {
            int curHeight = hits[i];

            if (stack.isEmpty() || curHeight >= hits[stack.peek()]) {
                stack.push(i++);
            } else {
                int index = stack.pop();
                int left = stack.isEmpty() ? -1 : stack.peek();

                maxArea = Math.max(maxArea, hits[index] * (i - left - 1));
            }
        }

        System.out.println(maxArea);
    }
}
