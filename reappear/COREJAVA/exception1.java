package reappear.COREJAVA;

import java.util.Arrays;
import java.util.Scanner;

public class exception1 {
    public static void main(String[] args)throws Exception {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int max = arr[arr.length-1];
        int min = arr[0];
        System.out.println(max);
        System.out.println(min);

        int diff=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            diff = diff-arr[i];
        }
        System.out.println(diff);
        if(diff<0)
        {
            throw new Exception("Subtract is less than Zero");
        }
        else
        {
            throw new Exception("Subtract is greater than equal to Zero");
        }
    }
}