package ete;

import java.util.Scanner;

public class ceiling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }

        sc.close();
        int idx = -1;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>=k)
            {
                idx=i;
            }
        }

        if(idx==-1)
        {
            System.out.println("-1");
        }
        else{
            System.out.print(arr[idx]+" "+idx);
        }
    }
    
}
