package BASIC.LeetCode;

import java.util.Scanner;

public class MajorityElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }

        int res = sol(arr);
        System.out.println(res);
    }

    public static int sol(int[] arr)
    {
        int ele = -1;
        int cnt = 0;

        for(int i=0;i<arr.length;i++)
        {
            if(cnt==0)
            {
                ele = arr[i];
                cnt++;
            }
            else if(ele == arr[i])
            {
                cnt++;
            }
            else
            {
                cnt--;
            }
        }
        return ele;
    }
}
