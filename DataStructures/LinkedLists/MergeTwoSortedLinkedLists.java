package DataStructures.LinkedLists;

import java.util.Scanner;

public class MergeTwoSortedLinkedLists {
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

    /* One of two versions of the mergeLists() method can be used here. */
    static SinglyLinkedListNode mergeLists(SinglyLinkedListNode headOne, SinglyLinkedListNode headTwo) {             //1
        if (headOne == null) return headTwo;
        else if (headTwo == null) return headOne;
        SinglyLinkedListNode headThree;
        if (headOne.data < headTwo.data) {
            headThree = headOne;
            headOne = headOne.next;
        } else {
            headThree = headTwo;
            headTwo = headTwo.next;
        }
        SinglyLinkedListNode node = headThree;
        while (headOne != null && headTwo != null) {
            if (headOne.data < headTwo.data) {
                node.next = headOne;
                headOne = headOne.next;
            } else {
                node.next = headTwo;
                headTwo = headTwo.next;
            }
            node = node.next;
        }
        if (headOne == null) node.next = headTwo;
        else node.next = headOne;
        return headThree;
    }

//    static SinglyLinkedListNode mergeLists(SinglyLinkedListNode headOne, SinglyLinkedListNode headTwo) {           //2
//        if (headOne == null) return headTwo;
//        else if (headTwo == null) return headOne;
//        else if (headOne.data < headTwo.data) {
//            headOne.next = mergeLists(headOne.next, headTwo);
//            return headOne;
//        } else {
//            headTwo.next = mergeLists(headOne, headTwo.next);
//            return headTwo;
//        }
//    }

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
                SinglyLinkedListNode listThree = mergeLists(listOne.head, listTwo.head);
                printSinglyLinkedList(listThree);
                System.out.println();
            }
        }
    }
}