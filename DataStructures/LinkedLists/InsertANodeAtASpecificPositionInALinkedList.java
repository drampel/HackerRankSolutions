package DataStructures.LinkedLists;

import java.util.Scanner;

public class InsertANodeAtASpecificPositionInALinkedList {
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

    static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode head, int data, int position) {
        SinglyLinkedListNode node = new SinglyLinkedListNode(data);
        if (position == 0) {
            node.next = head;
            return node;
        }
        SinglyLinkedListNode currentNode = head;
        while (--position > 0) currentNode = currentNode.next;
        node.next = currentNode.next;
        currentNode.next = node;
        return head;
    }

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            SinglyLinkedList list = new SinglyLinkedList();
            int n = scan.nextInt();
            while (n-- > 0) list.insertNode(scan.nextInt());
            int data = scan.nextInt();
            int position = scan.nextInt();
            SinglyLinkedListNode nodeList = insertNodeAtPosition(list.head, data, position);
            printSinglyLinkedList(nodeList);
        }
    }
}