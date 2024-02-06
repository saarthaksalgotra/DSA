package ete;

import java.util.*;

public class coinchangeDP {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();

    int[] arr = new int[m];
    
    for(int i=0;i<arr.length;i++)
    {
        arr[i] = sc.nextInt();
    }

    System.out.print(sol(arr,n));
    sc.close();

   }

   public static int sol(int[] arr , int n)
   {
        int[] DP = new int[n+1];
        Arrays.fill(DP,Integer.MAX_VALUE);

        DP[0]=0;
        for(int i:arr)
        {
            for(int j=i;j<=n;j++)
            {
                if(DP[j-i]!=Integer.MAX_VALUE)
                {
                    DP[j]=Math.min(DP[j],DP[j-i]+1);
                }
            }
        }

        if(DP[n]==Integer.MAX_VALUE)
        {
            return -1;
        }

        return DP[n];
   }

}