package BASIC.LeetCode;

import java.util.Scanner;

public class trappingRainWater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }

        int res = sol(arr);
        System.out.print(res);
    }

//    public static int sol(int[] arr){
//        int res = 0;
//        for(int i=0;i<arr.length;i++)
//        {
//
//            int lmax = arr[i];
//            int rmax = arr[i];
//
//            for(int j=i-1;j>=0;j--)
//            {
//                if(lmax<arr[j])
//                {
//                    lmax = arr[j];
//                }
//            }
//
//            for(int k=i+1;k<arr.length;k++)
//            {
//                if(rmax<arr[k])
//                {
//                    rmax = arr[k];
//                }
//            }
//
//            int water = Math.min(lmax,rmax)-arr[i];
//            res = res+water;
//        }
//        return res;
//    }

    public static int sol(int[] arr)
    {
        int n =arr.length;
        int[] maxLeft = new int[n];
        maxLeft[0] = arr[0];
        int[] maxRight = new int[n];
        maxRight[arr.length-1] = arr[arr.length-1];

        for(int i=1;i<arr.length;i++)
        {
            maxLeft[i] = Math.max(arr[i],maxLeft[i-1]);
        }

        for(int i=arr.length-2;i>=0;i--)
        {
            maxRight[i] = Math.max(arr[i],maxRight[i+1]);
        }

        int trapped = 0;
        for(int i=0;i<arr.length;i++)
        {
            int level = Math.min(maxLeft[i],maxRight[i]);
            trapped += level - arr[i];
        }

        return trapped;
    }
}
