package BASIC.BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int trgt = sc.nextInt();
        int ans = search(arr,trgt);
        System.out.print(ans);
    }

    public static int search(int[] arr , int trgt)
    {
        int lo = 0;
        int hi = arr.length-1;

        while(lo<=hi)
        {
            int mid = lo + (hi-lo)/2;

            if(arr[mid]==trgt)
            {
                // answer found
                return mid;
            }
            else if(trgt<arr[mid])
            {
                hi = mid-1;
            }
            else
            {
                lo = mid+1;
            }
        }

        //answer does not exist
        return -1;
    }

}
