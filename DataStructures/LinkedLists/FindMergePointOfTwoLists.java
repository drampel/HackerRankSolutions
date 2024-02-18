package DataStructures.LinkedLists;

import java.util.Objects;
import java.util.Scanner;

public class FindMergePointOfTwoLists {
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

    static int findMergeNode(SinglyLinkedListNode headOne, SinglyLinkedListNode headTwo) {
        SinglyLinkedListNode currentNodeOne = headOne;
        SinglyLinkedListNode currentNodeTwo = headTwo;
        while (currentNodeOne != currentNodeTwo) {
            currentNodeOne = Objects.requireNonNullElse(currentNodeOne.next, headTwo);
            currentNodeTwo = Objects.requireNonNullElse(currentNodeTwo.next, headOne);
        }
        return currentNodeOne.data;
    }

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int t = scan.nextInt();
            while (t-- > 0) {
                int index = scan.nextInt();
                SinglyLinkedList listOne = new SinglyLinkedList();
                int n = scan.nextInt();
                for (int i = 0; i < n; i++) listOne.insertNode(scan.nextInt());
                SinglyLinkedList listTwo = new SinglyLinkedList();
                int m = scan.nextInt();
                for (int i = 0; i < m; i++) listTwo.insertNode(scan.nextInt());
                SinglyLinkedListNode ptrOne = listOne.head;
                SinglyLinkedListNode ptrTwo = listTwo.head;
                for (int i = 0; i < index; i++) ptrOne = ptrOne.next;
                for (int i = 0; i < m - 1; i++) ptrTwo = ptrTwo.next;
                ptrTwo.next = ptrOne;
                int result = findMergeNode(listOne.head, listTwo.head);
                System.out.println(result);
            }
        }
    }
}