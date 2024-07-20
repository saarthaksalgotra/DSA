package reappear.PA;

import java.util.Scanner;

public class stock {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
        sol(arr);
    }
    public static void sol(int arr[])
    {
        int res[]=new int [arr.length];
        for(int i=0;i<arr.length;i++)
        {
            int cnt=1;
            for(int j=i-1;j>=0;j--)
            {
                if(arr[i]<arr[j])
                {
                    break;
                }
                cnt++;
            }
            res[i]=cnt;
        }
        for(int i=0;i<res.length;i++)
        {
            System.out.print(res[i]+" ");
        }
        System.out.print("END");
    }
}