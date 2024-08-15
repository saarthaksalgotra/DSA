package Infosys;

import java.util.Scanner;

public class MinRemoval {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }

        int ans = sol(arr);
        System.out.print(ans);
    }

    public static int sol(int[] arr) {

        int cnt = 0;

        for(int i=1;i<=arr.length;i++)
        {
            if(arr[i-1] != i)
            {
                cnt++;
            }

            if(arr[i-1]> i-cnt)
            {
                return -1;
            }
        }

        return cnt;

    }
}
