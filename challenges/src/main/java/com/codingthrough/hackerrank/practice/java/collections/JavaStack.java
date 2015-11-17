package com.codingthrough.hackerrank.practice.java.collections;

import java.util.*;

/**
 * Problem Statement:
 * In computer science, a stack or LIFO (last in, first out) is an
 * abstract data type that serves as a collection of elements, with
 * two principal operations: push, which adds an element to the collection,
 * and pop, which removes the last element that was added.(Wikipedia)
 * A string containing only parentheses is balanced if the following is
 * true: 1. if it is an empty string 2. if A and B are correct, AB is correct,
 * 3. if A is correct, (A) and {A} and [A] are also correct.
 * <p>
 * Examples of some correctly balanced strings are: "{}()", "[{()}]", "({()})"
 * <p>
 * Examples of some unbalanced strings are: "{}(", "({)}", "[[", "}{" etc.
 * <p>
 * Given a string, determine if it is balanced or not.
 * <p>
 * Input Format:
 * There will be multiple lines in the input file, each having a single
 * non-empty string. You should read input till end-of-file.
 * <p>
 * The part of the code that handles input operation is already provided in the editor.
 * <p>
 * Output Format:
 * For each case, print 'true' if the string is balanced, 'false' otherwise.
 * <p>
 * Sample Input:
 * {}()
 * ({()})
 * {}(
 * []
 * <p>
 * Sample Output:
 * true
 * true
 * false
 * true
 */
public class JavaStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            if (s.isEmpty()) {
                throw new IllegalArgumentException("String should not be null.");
            }
            System.out.println(isBalanced(s));
        }
    }

    private static boolean isBalanced(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }

        final Deque<Character> stack = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (brackets.containsKey(ch)) {
                stack.addFirst(ch);
            } else if (brackets.containsValue(ch)) {
                if (stack.isEmpty() || brackets.get(stack.pollFirst()) != ch) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    private static Map<Character, Character> brackets = new HashMap<>();

    static {
        brackets.put('(', ')');
        brackets.put('[', ']');
        brackets.put('{', '}');
    }
}
