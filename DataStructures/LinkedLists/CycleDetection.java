package DataStructures.LinkedLists;

import java.util.Scanner;

public class CycleDetection {
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

    static boolean hasCycle(SinglyLinkedListNode head) {
        SinglyLinkedListNode slowPointer = head;
        SinglyLinkedListNode fastPointer = head;
        while (fastPointer != null && fastPointer.next != null) {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
            if (slowPointer == fastPointer) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int t = scan.nextInt();
            while (t-- > 0) {
                int index = scan.nextInt();
                SinglyLinkedList list = new SinglyLinkedList();
                int n = scan.nextInt();
                for (int i = 0; i < n; i++) list.insertNode(scan.nextInt());
                SinglyLinkedListNode extra = null;
                SinglyLinkedListNode temp = list.head;
                for (int i = 0; i < n; i++) {
                    if (i == index) extra = temp;
                    if (i != n - 1) temp = temp.next;
                }
                temp.next = extra;
                boolean result = hasCycle(list.head);
                System.out.println(result ? 1 : 0);
            }
        }
    }
}