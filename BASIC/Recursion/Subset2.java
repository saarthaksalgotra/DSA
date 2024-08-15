package BASIC.Recursion;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Subset2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];


        for(int i=0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }

        HashSet<String> set= new HashSet<String>();
        sol(arr,set,0,"");
    }

    public static void sol(int[] arr , HashSet<String> set , int idx, String ans)
    {
        if(idx>=arr.length)
        {
            System.out.print(set);
            return;
        }


        sol(arr, set,idx+1,ans+arr[idx]);
        set.add(ans);
        sol(arr,set,idx+1,ans);


    }

}
