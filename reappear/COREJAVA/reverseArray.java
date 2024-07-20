package reappear.COREJAVA;

import java.util.Scanner;

public class reverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }

        sol(arr,k);
        for(int e: arr)
        {
            System.out.print(e+" ");
        }
    }

    public static void sol(int[] arr , int k)
    {
        for(int i=0;i<arr.length;i+=k)
        {
            if(i+k<arr.length)
            {
                reverse(arr,i,i+k-1);
            }
            else
            {
                reverse(arr,i,arr.length-1);
            }
        }
    }

    public static void reverse(int[] arr , int left , int right )
    {
        while (left<right)
        {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }
}
