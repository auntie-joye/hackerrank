package com.codingthrough.hackerrank.practice.datastructures.linkedlists;

/**
 * Problem Statement:
 * You’re given the pointer to the head node of a doubly linked list.
 * Reverse the order of the nodes in the list. The head node might be
 * NULL to indicate that the list is empty.
 * <p>
 * Input Format:
 * You have to complete the Node* Reverse(Node* head) method which takes
 * one argument - the head of the doubly linked list. You should NOT read
 * any input from stdin/console.
 * <p>
 * Output Format:
 * Change the next and prev pointers of all the nodes so that the direction
 * of the list is reversed. Then return the head node of the reversed list.
 * Do NOT print anything to stdout/console.
 * <p>
 * Sample Input:
 * NULL
 * NULL <-- 2 <--> 4 <--> 6 --> NULL
 * <p>
 * Sample Output:
 * NULL
 * NULL <-- 6 <--> 4 <--> 2 --> NULL
 * <p>
 * Explanation:
 * 1. Empty list, so nothing to do.
 * 2. 2,4,6 become 6,4,2 o reversing in the given doubly linked list.
 */
public class ReverseDoubleLinkedList {
    public static class Node {
        int data;
        Node next;
        Node prev;
    }

    Node reverse(Node head) {
        Node prev = null;
        Node cur = head;
        while(cur != null) {
            Node next = cur.next;
            cur.next = prev;
            cur.prev = next;

            prev = cur;
            cur = next;
        }

        return prev;
    }

    private Node reverseRecursive(Node prev, Node cur) {
        if (cur == null) {
            return prev;
        }

        Node next = cur.next;
        cur.next = prev;
        cur.prev = next;
        return reverseRecursive(cur, next);
    }
}
