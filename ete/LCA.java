package ete;

import java.util.Scanner;

class Node{
    int data;
    Node left,right;

    public Node(int data)
    {
        this.data = data;
        this.left=this.right=null;
    }
}
public class LCA {

    static Node insert(Node root , int data)
    {
        if(root==null)
        {
            return new Node(data);
        }

        if(data<root.data)
        {
            root.left = insert(root.left, data);
        }

        if(data>root.data)
        {
            root.right = insert(root.right,data);
        }

        return root;
    }

    static int least(Node root,int n1,int n2)
    {
        if(root == null)
        {
            return -1;
        }

        if(n1<=root.data && n2>=root.data)
        {
            return root.data;
        }
        if(n1<root.data && n2<root.data)
        {
            return least(root.left, n1, n2);
        }

        if(n1>root.data && n2>root.data)
        {
            return least(root.right, n1, n2);
        }

        return -1;
    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node root =null;
        int n = sc.nextInt();
        for(int i=0;i<n;i++)
        {
            root = insert(root,sc.nextInt());
        }

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int res = least(root, n1, n2);
        System.out.print(res);
        sc.close();
    }
}