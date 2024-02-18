package DataStructures.LinkedLists;

import java.util.Scanner;

public class ReverseADoublyLinkedList {
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

    /* One of two versions of the reverse() method can be used here. */
    static DoublyLinkedListNode reverse(DoublyLinkedListNode head) {                                                 //1
        DoublyLinkedListNode currentNode = head;
        DoublyLinkedListNode prevNode = null;
        while (currentNode != null) {
            DoublyLinkedListNode nextNode = currentNode.next;
            currentNode.next = prevNode;
            currentNode.prev = nextNode;
            prevNode = currentNode;
            currentNode = nextNode;
        }
        return prevNode;
    }

//    static DoublyLinkedListNode reverse(DoublyLinkedListNode head) {                                               //2
//        if (head == null) return null;
//        DoublyLinkedListNode nextNode = head.next;
//        head.next = head.prev;
//        head.prev = nextNode;
//        return nextNode == null ? head : reverse(nextNode);
//    }

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int t = scan.nextInt();
            while (t-- > 0) {
                DoublyLinkedList list = new DoublyLinkedList();
                int n = scan.nextInt();
                for (int i = 0; i < n; i++) list.insertNode(scan.nextInt());
                DoublyLinkedListNode nodeList = reverse(list.head);
                printDoublyLinkedList(nodeList);
                System.out.println();
            }
        }
    }
}