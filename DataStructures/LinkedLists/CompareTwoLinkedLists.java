package DataStructures.LinkedLists;

import java.util.Scanner;

public class CompareTwoLinkedLists {
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

    static boolean compareLists(SinglyLinkedListNode headOne, SinglyLinkedListNode headTwo) {
        while (headOne != null && headTwo != null && headOne.data == headTwo.data) {
            headOne = headOne.next;
            headTwo = headTwo.next;
        }
        return headOne == null && headTwo == null;
    }

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int t = scan.nextInt();
            while (t-- > 0) {
                SinglyLinkedList listOne = new SinglyLinkedList();
                int n = scan.nextInt();
                while (n-- > 0) listOne.insertNode(scan.nextInt());
                SinglyLinkedList listTwo = new SinglyLinkedList();
                int m = scan.nextInt();
                while (m-- > 0) listTwo.insertNode(scan.nextInt());
                boolean result = compareLists(listOne.head, listTwo.head);
                System.out.println(result ? 1 : 0);
            }
        }
    }
}