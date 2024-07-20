package reappear.PA;

import java.util.Scanner;

public class nextBigElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }

        sol(arr);
    }

    public static void sol(int[] arr)
    {
        int n = arr.length;
        int[] res = new int[n];

        for(int i=0;i<res.length;i++)
        {
            res[i] = -1;
        }

        for(int i=arr.length-1;i>=0;i--)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]>arr[i])
                {
                    res[i]=arr[j];
                    break;
                }
            }
        }

        for(int i=0;i<res.length;i++)
        {
            System.out.print(res[i]+" ");
        }
    }

}
