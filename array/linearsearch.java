package array;

import java.util.Scanner;

public class linearsearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        
        int[] arr = new int[n];

        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }

        int key = sc.nextInt();
        sc.close();
        int idx = search(arr,key);
        if(idx == -1)
        {
            System.out.println("invalid key!");
        }
        else
        {
            System.out.println("key is at: "+ idx);
        }
    }

    public static int search(int[] arr, int key)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==key)
            {
                return i;
            }
        }
        return -1;

    }
}
