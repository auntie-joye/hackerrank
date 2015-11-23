package com.codingthrough.hackerrank.practice.datastructures.linkedlists;

/**
 * Problem Statement:
 * You’re given the pointer to the head node of a sorted doubly linked
 * list and an integer to insert into the list. Create a node and insert
 * it into the appropriate position in the list. The head node might be
 * NULL to indicate that the list is empty.
 * <p>
 * Input Format:
 * You have to complete the Node* SortedInsert(Node* head, int data) method
 * which takes two arguments - the head of the sorted, doubly linked list and
 * the value to insert. You should NOT read any input from stdin/console.
 * <p>
 * Output Format:
 * Create a node with the given data and insert it into the given list, making
 * sure that the new list is also sorted. Then return the head node of the updated
 * list. Do NOT print anything to stdout/console.
 * <p>
 * Sample Input:
 * NULL , data = 2
 * NULL <-- 2 <--> 4 <--> 6 --> NULL , data = 5
 * <p>
 * Sample Output:
 * NULL <-- 2 --> NULL
 * NULL <-- 2 <--> 4 <--> 5 <--> 6 --> NULL
 * <p>
 * Explanation:
 * 1. We have an empty list, 2 is inserted.
 * 2. Data 5 is inserted such as list remains sorted.
 */
public class InsertIntoSortedDoubleLinkedList {
    public static class Node {
        int data;
        Node next;
        Node prev;
    }

    Node sortedInsert(Node head, int data) {
        final Node node = new Node();
        node.data = data;

        if (head == null) {
            head = node;
            return head;
        }

        if (head.data > data) {
            node.next = head;
            head.prev = node;
            head = node;
            return head;
        }

        Node cur = head;
        while (cur.next != null && cur.next.data <= data) {
            cur = cur.next;
        }

        node.next = cur.next;
        node.prev = cur;
        if (cur.next != null) {
            cur.next.prev = node;
        }
        cur.next = node;

        return head;
    }
}
