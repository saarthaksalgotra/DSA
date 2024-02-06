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
public class heightoftree {
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

    static int height(Node root)
    {
        if(root == null)
        {
            return 0;
        }

        int left = height(root.left);
        int right = height(root.right);

        if(left>right)
        {
            return left+1;
        }
        else
        {
            return right+1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node root = null;
        int n =sc.nextInt();

        for(int i=0;i<n;i++)
        {
            root = insert(root, sc.nextInt());
        }
        sc.close();
        System.out.print(height(root));
    }
}
