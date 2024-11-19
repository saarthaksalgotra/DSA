package Assignment;

import java.util.Scanner;

class Node {
    int val;
    Node next;
    Node(int x) {
        val = x;
        next = null;
    }
}

public class Q6 {
    public static Node oddEvenList(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

       Node odd = head;
       Node even = head.next;
       Node evenHead = even;

        while (even != null && even.next != null) {
            odd.next = odd.next.next;
            even.next = even.next.next;

            odd = odd.next;
            even = even.next;
        }
        odd.next = evenHead;

        return head;
    }
    public static void printList(Node head) {
       Node current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static Node createLinkedList(int[] nums) {
        if (nums == null || nums.length == 0) return null;

      Node head = new Node(nums[0]);
      Node current = head;

        for (int i = 1; i < nums.length; i++) {
            current.next = new Node(nums[i]);
            current = current.next;
        }

        return head;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] inputArray = new int[n];
        for (int i = 0; i < n; i++) {
            inputArray[i] = sc.nextInt();
        }
        Node head = createLinkedList(inputArray);
        Node result = oddEvenList(head);
        printList(result);
    }
}

