package com.codingthrough.hackerrank.practice.datastructures.linkedlists;

/**
 * Problem Statement:
 * You’re given the pointer to the head node of a linked list.
 * Change the next pointers of the nodes so that their order is
 * reversed. The head pointer given may be null meaning that the
 * initial list is empty.
 * <p>
 * Input Format:
 * You have to complete the Node* Reverse(Node* head) method which
 * takes one argument - the head of the linked list. You should NOT
 * read any input from stdin/console.
 * <p>
 * Output Format:
 * Change the next pointers of the nodes that their order is reversed
 * and return the head of the reversed linked list. Do NOT print anything
 * to stdout/console.
 * <p>
 * Sample Input:
 * NULL
 * 2 --> 3 --> NULL
 * <p>
 * Sample Output:
 * NULL
 * 3 --> 2 --> NULL
 * <p>
 * Explanation:
 * 1. Empty list remains empty
 * 2. List is reversed from 2,3 to 3,2
 */
public class ReverseLinkedList {
    private static class Node {
        int data;
        Node next;
    }

    public static Node reverse(Node head) {
        Node prev = null;
        Node cur = head;
        while(cur != null) {
            Node next = cur.next;
            cur.next = prev;

            prev = cur;
            cur = next;
        }

        return prev;
    }

    private static Node reverseRecursive(Node prev, Node cur) {
        if (cur == null) {
            return prev;
        }

        Node next = cur.next;
        cur.next = prev;
        return reverseRecursive(cur, next);
    }
}
