package ete;
// PRINT NODES ON LEVEL Q4
import java.util.Scanner;
class Node{
    int data;
    Node left ,right;

    public Node(int data){
        this.data=data;
        this.left=this.right=null;
    }
}

public class printNodesofLevel {
    public static void PrintLevel(Node root,int level)
    {
        if(root == null)
        {
            return;
        }

        if(level==1)
        {
            System.out.print(root.data+" ");
            return;
        }

        if(level>1)
        {
            PrintLevel(root.left, level-1);
            PrintLevel(root.right, level-1);
        }
    }

    public static Node insert(Node root,int data){
        if (root == null)
        {
            return new Node(data);
        }

        if(data<root.data)
        {
            root.left=insert(root.left,data);
        }

        if(data>root.data)
        {
            root.right=insert(root.right,data);
        }

        return root;

    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Node root=null;
        int n = sc.nextInt();
        for(int i=0;i<n;i++)
        {
            root = insert(root, sc.nextInt());
        }

        int k = sc.nextInt();
        sc.close();
        PrintLevel(root, k+1);
    }
}