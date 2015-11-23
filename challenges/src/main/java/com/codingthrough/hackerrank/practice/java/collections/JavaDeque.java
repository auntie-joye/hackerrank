package com.codingthrough.hackerrank.practice.java.collections;

import java.util.*;

/**
 * Problem Statement:
 * In computer science, a double-ended queue (dequeue, often abbreviated to
 * deque, pronounced deck) is an abstract data type that generalizes a
 * queue, for which elements can be added to or removed from either
 * the front (head) or back (tail).
 * <p>
 * Deque interfaces can be implemented using various types of collections
 * such as LinkedList or ArrayDeque classes. For example, deque can be declared as:
 * <p>
 * Deque deque = new LinkedList<>();
 * or
 * Deque deque = new ArrayDeque<>();
 * You can find more details about Deque here.
 * <p>
 * In this problem, you are given N integers. You need to find the maximum
 * number of unique integers among all the possible contiguous subarrays of size M.
 * <p>
 * Note: Time limit is 3 second for this problem.
 * <p>
 * Input Format:
 * The first line of input contains two integers N and M: representing the
 * total number of integers and the size of the subarray, respectively. The
 * next line contains N space separated integers.
 * <p>
 * Constraints:
 * 1?N?100000
 * 1?M?100000
 * M?N
 * The numbers in the array will range between [0,10000000].
 * <p>
 * Output Format:
 * Print the maximum number of unique integers among all possible contiguous
 * subarrays of size M separated by a space.
 * <p>
 * Sample Input:
 * 6 3
 * 5 3 5 2 3 2
 * <p>
 * Sample Output:
 * 3
 * <p>
 * Explanation:
 * In the sample testcase, there are 5 subarrays of contiguous numbers.
 * <p>
 * s1=?5,3,5? - Has 2 unique numbers.
 * <p>
 * s2=?3,5,2? - Has 3 unique numbers.
 * <p>
 * s3=?5,2,3? - Has 3 unique numbers.
 * <p>
 * s4=?2,3,2? - Has 2 unique numbers.
 * <p>
 * In these subarrays, there are 2,3,3,2 unique numbers, respectively. The maximum amount
 * of unique numbers among all possible contiguous subarrays is 3.
 */
public class JavaDeque {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        int max = Integer.MIN_VALUE;
        final Deque<Integer> deque = new ArrayDeque<>();
        final Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            deque.addLast(num);

            incrementCountFor(map, num);

            if (deque.size() == m) {
                max = Math.max(max, map.keySet().size());
                int first = deque.removeFirst();
                decrementCountFor(map, first);
            }
        }

        System.out.println(max);
    }

    private static void incrementCountFor(final Map<Integer, Integer> map, Integer num) {
        Integer count = map.get(num);
        if (count == null) {
            count = 0;
        }
        map.put(num, ++count);
    }

    private static void decrementCountFor(final Map<Integer, Integer> map, Integer num) {
        Integer count = map.get(num);
        if (--count == 0) {
            map.remove(num);
        } else {
            map.put(num, count);
        }
    }
}
