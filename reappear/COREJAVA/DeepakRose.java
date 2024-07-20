package reappear.COREJAVA;

import java.util.Arrays;
import java.util.Scanner;

public class DeepakRose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }

        int trgt = sc.nextInt();

        sol(arr,trgt);
    }

    public static void sol(int[] arr , int target)
    {
        Arrays.sort(arr); // sort the Array

        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum > target) {
                right--;
            } else if (sum < target) {
                left++;
            }
            else
            {
                left++;
                right--;
            }
        }
        System.out.println("Deepak should buy roses whose prices are " + arr[right]
                + " and " + arr[left] + ".");
    }
}
