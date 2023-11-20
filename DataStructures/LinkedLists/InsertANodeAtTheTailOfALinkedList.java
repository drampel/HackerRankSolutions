package DataStructures.LinkedLists;

import java.util.Scanner;

public class InsertANodeAtTheTailOfALinkedList {
    static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

    static class SinglyLinkedList {
        public SinglyLinkedListNode head;

        public SinglyLinkedList() {
            this.head = null;
        }
    }

    static void printSinglyLinkedList(SinglyLinkedListNode head) {
        while (head != null) {
            System.out.println(head.data);
            head = head.next;
        }
    }

    static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
        SinglyLinkedListNode node = new SinglyLinkedListNode(data);
        if (head == null) return node;
        SinglyLinkedListNode currentNode = head;
        while (currentNode.next != null) currentNode = currentNode.next;
        currentNode.next = node;
        return head;
    }

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            SinglyLinkedList list = new SinglyLinkedList();
            int n = scan.nextInt();
            while (n-- > 0) list.head = insertNodeAtTail(list.head, scan.nextInt());
            printSinglyLinkedList(list.head);
        }
    }
}