package ete;

import java.util.*;

public class magnet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }

        Arrays.sort(arr);

        int start = 1;
        int end = arr[n-1];
        int res =-1;

        while(start<end)
        {
            int mid = (start+end)/2;
            if(solve(mid,arr,n,k))
            {
                res = Math.max(res,mid);
                start =mid+1;
            }
            else
            {
                end=mid;
            }
        }
        System.out.print(res);
        sc.close();
    }

    public static boolean solve(int mid,int[] arr,int n,int k)
    {
        int pos = arr[0];
        int elements = 1;
        for(int i=0;i<n;i++)
        {
            if(arr[i]-pos>=mid){
                pos=arr[i];
                elements++;
                if(elements==k)
                {
                    return true;
                }
            }
        }
        return false;
    }
    
}
