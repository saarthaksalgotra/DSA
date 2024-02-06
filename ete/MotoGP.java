package ete;

import java.util.*;

public class MotoGP {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }

        int ans=sol(arr);
        System.out.println(ans);
        sc.close();
    }

    public static int sol(int[] arr)
    {
        Arrays.sort(arr);
        int minSkill = Math.abs(arr[1]-arr[0]);

        for(int i=1;i<arr.length;i++)
        {
            minSkill = Math.min(arr[i]-arr[i-1],minSkill);
        }

        return minSkill;
    }
}
