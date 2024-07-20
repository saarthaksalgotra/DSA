package BASIC.Sorting;

import java.util.Scanner;

public class ReverseSelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }

        sol(arr);
    }

    public static void sol(int[] arr) {
    int cnt = 0;
        for(int i=0;i<arr.length-1;i++)
        {
            cnt++;
            int max = i;
            
            for(int j = i+1;j<arr.length;j++)
            {
                if(arr[j]>arr[max])
                {
                    max = j;

                }
            }

            //swap
            int temp = arr[max];
            arr[max] = arr[i];
            arr[i] = temp;
        }
        System.out.println(cnt);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
