package reappear.COREJAVA;

import java.util.Arrays;
import java.util.Scanner;

public class squareofarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }

        for(int i=0;i<arr.length;i++)
        {
            arr[i]=arr[i]*arr[i];
        }

        Arrays.sort(arr);

        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
