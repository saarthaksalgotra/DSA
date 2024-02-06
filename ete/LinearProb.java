package ete;

import java.util.*;

public class LinearProb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n =sc.nextInt();
        int[] arr =new int[5];

        Arrays.fill(arr,-1);

        for(int i=0;i<n;i++)
        {
            int temp = sc.nextInt();
            int rem = temp%5;

            if(arr[rem]==-1)
            {
                arr[rem]=temp;
            }
            else{
                while(arr[rem]!=-1)
                {
                    rem++;
                    rem=rem%5;
                }
                arr[rem]=temp;
            }
        }

        for(int i=0;i<5;i++)
        {
            if(arr[i]==-1)
            {
                continue;
            }

            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
