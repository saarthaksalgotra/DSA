package BASIC.Arrays;

import java.util.Scanner;

public class subarray {
    public static void main(String[] args) {
        // number of subarrays --> n*(n+1)/2
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<arr.length;i++)
        {
            for(int j=i;j<arr.length;j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
        }
        System.out.println();
        int nos = n*(n+1)/2;
        System.out.print(nos);
    }
}