package BASIC.LeetCode;

import java.util.Scanner;

public class ProductOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }

       int[] res = sol(arr);
        for(int i=0;i<res.length;i++)
        {
            System.out.print(res[i]+" ");
        }
    }
//brute
//    public static int[] sol(int[] arr)
//    {
//        int[] ans = new int[arr.length];
//        for(int i=0;i<arr.length;i++)
//        {
//            int prev = 1;
//            for(int j=i-1;j>=0;j--)
//            {
//                prev = prev*arr[j];
//            }
//            int next = 1;
//            for(int k=i+1;k<arr.length;k++)
//            {
//                next = next*arr[k];
//            }
//
//            ans[i] = next*prev;
//        }
//        return ans;
//    }

    public static int[] sol(int[] arr)
    {
        int[] pref = new int[arr.length];
        int[] suff = new int[arr.length];
        int[] ans = new int[arr.length];

        int multi = 1;
        for(int i=0;i<arr.length;i++)
        {
            pref[i]=multi*arr[i];
            multi = pref[i];
        }
        multi = 1;
        for(int i=arr.length-1;i>=0;i--)
        {
            suff[i] = multi*arr[i];
            multi = suff[i];
        }

        for(int i=0;i<arr.length;i++)
        {
            if(i==0)
            {
                ans[i]=suff[i+1];
                continue;
            }

            if(i==ans.length-1)
            {
                ans[i]=pref[i-1];
                continue;
            }
            ans[i] = pref[i-1]*suff[i+1];
        }

        return ans;
    }
}
