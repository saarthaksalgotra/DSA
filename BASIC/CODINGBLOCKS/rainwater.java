package BASIC.CODINGBLOCKS;
import java.util.Scanner;
public class rainwater {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test>0)
        {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<arr.length;i++)
            {
                arr[i] = sc.nextInt();
            }
            int res = sol(arr,n);
            System.out.println(res);
            test--;
        }
    }

    public static int sol(int[] arr,int n)
    {
        int maxLeft[] = new int[n];
        int maxRight[] = new int[n];

        maxLeft[0] = arr[0];
        for(int i=1;i<arr.length;i++)
        {
            maxLeft[i] = Math.max(arr[i],maxLeft[i-1]);
        }

        maxRight[arr.length-1] = arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--)
        {
            maxRight[i] = Math.max(arr[i],maxRight[i+1]);
        }

        int trap = 0;
        for(int i=0;i<arr.length;i++)
        {
            int lvl = Math.min(maxLeft[i],maxRight[i]);
            trap += lvl-arr[i];
        }

        return trap;
    }
}
