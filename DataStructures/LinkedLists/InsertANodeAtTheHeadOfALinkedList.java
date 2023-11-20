package DataStructures.LinkedLists;

import java.util.Scanner;

public class InsertANodeAtTheHeadOfALinkedList {
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

    static SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode head, int data) {
        SinglyLinkedListNode node = new SinglyLinkedListNode(data);
        node.next = head;
        return node;
    }

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            SinglyLinkedList list = new SinglyLinkedList();
            int n = scan.nextInt();
            while (n-- > 0) list.head = insertNodeAtHead(list.head, scan.nextInt());
            printSinglyLinkedList(list.head);
        }
    }
}