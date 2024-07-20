package BASIC.CODINGBLOCKS;

import java.util.Scanner;

public class ProductOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        long[] arr = new long[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = sc.nextLong();
        }

        long[] res = sol(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(res[i]+" ");
        }
    }

    public static long[] sol(long[] arr)
    {
        long[] pref = new long[arr.length];
        long[] suff = new long[arr.length];
        long[] ans  = new long[arr.length];

        long multi = 1;
        for(int i=0;i<arr.length;i++)
        {
            pref[i] = arr[i]*multi;
            multi = pref[i];
        }

        multi = 1;
        for(int i=arr.length-1;i>=0;i--)

        {
            suff[i] = arr[i]*multi;
            multi = suff[i];
        }


        for(int i=0;i<arr.length;i++)
        {
            if(i==0)
            {
                ans[i] = suff[i+1];
                continue;
            }
            if(i==arr.length-1)
            {
                ans[i] = pref[i-1];
                continue;
            }
            ans[i] = pref[i-1]*suff[i+1];
        }
        return ans;
    }
}
