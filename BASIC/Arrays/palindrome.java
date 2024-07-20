package BASIC.Arrays;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }

       boolean ans = sol(arr);
        if(ans==true)
        {
            System.out.print("Palindrome");
        }
        else
        {
            System.out.print("Not palindrome");
        }
    }

    public static boolean sol(int[] arr)
    {
        int i=0;
        int j=arr.length-1;
        while(i<=j)
        {
            if(arr[i]!=arr[j])
            {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }
}
