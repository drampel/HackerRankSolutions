package DataStructures.LinkedLists;

import java.util.Scanner;

public class DeleteANode {
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

    /* One of two versions of the deleteNode() method can be used here. */
    static SinglyLinkedListNode deleteNode(SinglyLinkedListNode head, int position) {                                //1
        if (position == 0) return head.next;
        SinglyLinkedListNode currentNode = head;
        while (--position > 0) currentNode = currentNode.next;
        currentNode.next = currentNode.next.next;
        return head;
    }

//    static SinglyLinkedListNode deleteNode(SinglyLinkedListNode head, int position) {                              //2
//        if (position == 0) return head.next;
//        head.next = deleteNode(head.next, --position);
//        return head;
//    }

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            SinglyLinkedList list = new SinglyLinkedList();
            int n = scan.nextInt();
            while (n-- > 0) list.insertNode(scan.nextInt());
            int position = scan.nextInt();
            SinglyLinkedListNode nodeList = deleteNode(list.head, position);
            printSinglyLinkedList(nodeList);
        }
    }
}