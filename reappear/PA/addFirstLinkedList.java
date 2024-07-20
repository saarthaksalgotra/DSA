package reappear.PA;

import java.util.LinkedList;
import java.util.Scanner;

public class addFirstLinkedList {
    static Node head;
static class Node{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        addFirstLinkedList List = new addFirstLinkedList();
        int n = sc.nextInt();

        while(n -- > 0)
        {
            int data = sc.nextInt();
            addFirst(data);
        }
        display();
    }

    public static void addFirst(int n)
    {
        Node newNode = new Node(n);
        if(head == null)
        {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public static void display(){
        Node currnode = head;
        while(currnode != null)
        {
            System.out.print(currnode.data+" ");
            currnode = currnode.next;
        }
    }
}
