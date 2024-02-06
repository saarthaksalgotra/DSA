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
public class leafNode {
    static Node insert(Node root,int data)
    {
        if(root == null)
        {
            return new Node(data);
        }

        if(data<root.data)
        {
            root.left=insert(root.left, data);
        }

        if(data>root.data)
        {
            root.right=insert(root.right, data);
        }

        return root;
    }

    static void leaf(Node root){
        if(root == null)
        {
            return;
        }

        if(root.left==null && root.right==null)
        {
            System.out.print(root.data+" ");
        }

        if(root.left!=null)
        {
            leaf(root.left);
        }

        if(root.right !=null)
        {
            leaf(root.right);
        }
    }

    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        Node root = null;

        int n =sc.nextInt();
    
        for(int i=0;i<n;i++)
        {
            root = insert(root, sc.nextInt());
        }
        sc.close();
        leaf(root);
    }
}