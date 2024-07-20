package BASIC.Sorting;

import java.util.Scanner;

public class ReverseBubbleSort {
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
        for (int i = 0; i < arr.length - 1; i++)
        {
            boolean flag = false;
            for (int j = 0; j < arr.length - 1 - i;j++)
            {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    flag = true;
                }
            }
            if(flag = false)
            {
                break;
            }
        }

        for(int i = 0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
