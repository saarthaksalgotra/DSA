package ete;

import java.util.Scanner;

class Node{
    int data;
    Node left,right;

    public Node(int data)
    {
        this.data=data;
        this.left=this.right=null;
    }
}
public class rightview {
    static int LH;
    static void Rightview(Node root,int RH)
    {
        if(root==null)
        {
            return;
        }

        if(LH<RH)
        {
            System.out.print(root.data+" ");
            LH=RH;
        }

        Rightview(root.right, RH+1);
        Rightview(root.left, RH+1);
    }
    static Node insert(Node root,int data)
    {
        if(root==null)
        {
            return new Node(data);
        }

        if(data<root.data)
        {
            root.left=insert(root.left, data);
        }

        if(data>root.data)
        {
            root.right=insert(root.right,data);
        }

        return root;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node root = null;
        int n = sc.nextInt();
        for(int i=0;i<n;i++)
        {
            root = insert(root,sc.nextInt());
        }
        sc.close();
        Rightview(root, 1);
    }
}