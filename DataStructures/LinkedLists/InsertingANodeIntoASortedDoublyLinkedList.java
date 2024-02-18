package DataStructures.LinkedLists;

import java.util.Scanner;

public class InsertingANodeIntoASortedDoublyLinkedList {
    static class DoublyLinkedListNode {
        public int data;
        public DoublyLinkedListNode next;
        public DoublyLinkedListNode prev;

        public DoublyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
            this.prev = null;
        }
    }

    static class DoublyLinkedList {
        public DoublyLinkedListNode head;
        public DoublyLinkedListNode tail;

        public DoublyLinkedList() {
            this.head = null;
            this.tail = null;
        }

        public void insertNode(int nodeData) {
            DoublyLinkedListNode node = new DoublyLinkedListNode(nodeData);
            if (this.head == null) this.head = node;
            else {
                this.tail.next = node;
                node.prev = this.tail;
            }
            this.tail = node;
        }
    }

    static void printDoublyLinkedList(DoublyLinkedListNode nodeList) {
        while (nodeList != null) {
            System.out.print(nodeList.data);
            nodeList = nodeList.next;
            if (nodeList != null) System.out.print(" ");
        }
    }

    /* One of two versions of the sortedInsert() method can be used here. */
    static DoublyLinkedListNode sortedInsert(DoublyLinkedListNode head, int data) {                                  //1
        DoublyLinkedListNode node = new DoublyLinkedListNode(data);
        if (head == null) return node;
        if (data <= head.data) {
            node.next = head;
            head.prev = node;
            return node;
        }
        DoublyLinkedListNode currentNode = head;
        while (currentNode.next != null && currentNode.next.data < data) currentNode = currentNode.next;
        node.next = currentNode.next;
        node.prev = currentNode;
        if (currentNode.next != null) currentNode.next.prev = node;
        currentNode.next = node;
        return head;
    }

//    static DoublyLinkedListNode sortedInsert(DoublyLinkedListNode head, int data) {                                //2
//        if (head == null) return new DoublyLinkedListNode(data);
//        if (head.data <= data) {
//            head.next = sortedInsert(head.next, data);
//            head.next.prev = head;
//        } else {
//            DoublyLinkedListNode node = new DoublyLinkedListNode(data);
//            node.next = head;
//            node.prev = head.prev;
//            head.prev = node;
//            head = node;
//        }
//        return head;
//    }

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int t = scan.nextInt();
            while (t-- > 0) {
                DoublyLinkedList list = new DoublyLinkedList();
                int n = scan.nextInt();
                for (int i = 0; i < n; i++) list.insertNode(scan.nextInt());
                int data = scan.nextInt();
                DoublyLinkedListNode nodeList = sortedInsert(list.head, data);
                printDoublyLinkedList(nodeList);
                System.out.println();
            }
        }
    }
}