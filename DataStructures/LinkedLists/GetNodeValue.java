package DataStructures.LinkedLists;

import java.util.Scanner;

public class GetNodeValue {
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

    static int getNode(SinglyLinkedListNode head, int positionFromTail) {
        SinglyLinkedListNode node = head;
        for (int i = 0; head.next != null; i++) {
            head = head.next;
            if (i >= positionFromTail) node = node.next;
        }
        return node.data;
    }

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int t = scan.nextInt();
            while (t-- > 0) {
                SinglyLinkedList list = new SinglyLinkedList();
                int n = scan.nextInt();
                while (n-- > 0) list.insertNode(scan.nextInt());
                int positionFromTail = scan.nextInt();
                int valueFromTail = getNode(list.head, positionFromTail);
                System.out.println(valueFromTail);
            }
        }
    }
}