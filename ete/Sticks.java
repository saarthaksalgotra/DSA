package ete;

import java.util.*;

public class Sticks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   //No of sticks
        int len = sc.nextInt(); //length of sticks

        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int res = sol(arr,len);
        System.out.print(res);
        sc.close();
    }

    public static int sol(int[] arr,int len)
    {
        //for two sticks
        int count = 0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]+arr[j]==len)
                {
                    count++;
                    i=j;
                    break;
                }
            }
        }

        //for one stick
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==len)
            {
                count++;
                break;
            }
        }

        return count;
    }
    
}
