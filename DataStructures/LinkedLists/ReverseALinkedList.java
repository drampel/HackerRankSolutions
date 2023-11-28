package DataStructures.LinkedLists;

import java.util.Scanner;

public class ReverseALinkedList {
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
        public SinglyLinkedListNode tail;

        public SinglyLinkedList() {
            this.head = null;
            this.tail = null;
        }

        public void insertNode(int nodeData) {
            SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);
            if (this.head == null) this.head = node;
            else this.tail.next = node;
            this.tail = node;
        }
    }

    static void printSinglyLinkedList(SinglyLinkedListNode nodeList) {
        while (nodeList != null) {
            System.out.print(nodeList.data);
            nodeList = nodeList.next;
            if (nodeList != null) System.out.print(" ");
        }
    }

    static SinglyLinkedListNode reverse(SinglyLinkedListNode head) {
        SinglyLinkedListNode tail = null;
        while (head != null) {
            SinglyLinkedListNode node = new SinglyLinkedListNode(head.data);
            node.next = tail;
            tail = node;
            head = head.next;
        }
        return tail;
    }

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int t = scan.nextInt();
            while (t-- > 0) {
                SinglyLinkedList list = new SinglyLinkedList();
                int n = scan.nextInt();
                while (n-- > 0) list.insertNode(scan.nextInt());
                SinglyLinkedListNode nodeList = reverse(list.head);
                printSinglyLinkedList(nodeList);
                System.out.println();
            }
        }
    }
}