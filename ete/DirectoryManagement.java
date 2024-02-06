package ete;

import java.util.*;

class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;

    public TreeNode(int data)
    {
        this.data=data;
        this.left=this.right=null;
    }
}
public class DirectoryManagement {
    static TreeNode insert(TreeNode root,int data)
    {
        if(root==null)
        {
            return new TreeNode(data);
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

    static void inorder(TreeNode root)
    {
        if(root==null)
        {
            return;
        }

        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    static void preorder(TreeNode root)
    {
        if(root==null)
        {
            return;
        }

        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

    static void postorder(TreeNode root)
    {
        if(root==null)return;

        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }

    static void levelorder(TreeNode root)
    {
        if(root==null)return;
       Queue<TreeNode> queue = new LinkedList<>();
       queue.add(root);
       while(!queue.isEmpty())
       {
        TreeNode current = queue.poll();
        System.out.print(current.data+" ");

        if(current.left!=null)
        {
            queue.add(current.left);
        }

        if(current.right!=null)
        {
            queue.add(current.right);
        }

       }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeNode root=null;
        int n =sc.nextInt();
        for(int i=0;i<n;i++)
        {
            root = insert(root, sc.nextInt());
        }

        inorder(root);
        System.out.println();
        preorder(root);
        System.out.println();
        postorder(root);
        System.out.println();
        levelorder(root);
        sc.close();
    }
}
