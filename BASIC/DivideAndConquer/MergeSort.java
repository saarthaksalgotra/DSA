package BASIC.DivideAndConquer;

import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }

        int[] ans =sol(arr,0,arr.length-1);

        for(int i=0;i<ans.length;i++)
        {
            System.out.print(ans[i]+" ");
        }
    }
    public static int[] sol(int[] arr , int lo , int hi)
    {
        if(lo==hi)
        {
            int[] res = new int[1];
            res[0] = arr[lo];
            return res;
        }
        int mid = (lo+hi)/2;
        int[] left = sol(arr,lo,mid);
        int[] right = sol(arr,mid+1,hi);
        int[]ans = sort(left,right);
        return ans;
    }

    public static int[] sort(int[] a , int[] b)
    {
        int[] res = new int[a.length+b.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while(i<a.length && j<b.length)
        {
            if(a[i]<b[j])
            {
                res[k] = a[i];
                i++;
                k++;
            }
            else
            {
                res[k] = b[j];
                j++;
                k++;
            }
        }

        while(i<a.length)
        {
            res[k] = a[i];
            i++;
            k++;
        }

        while(j<b.length)
        {
            res[k] = b[j];
            j++;
            k++;
        }

        return res;
    }
}
