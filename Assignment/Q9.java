package Assignment;

import java.util.Arrays;
import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-->0)
        {
            int n = sc.nextInt();
            int noc = sc.nextInt();

            int[] arr = new int[n];

            for(int i=0;i<arr.length;i++)
            {
                arr[i] = sc.nextInt();
            }

            Arrays.sort(arr);
            int lo = arr[0];
            int hi = arr[arr.length-1];

            int ans = 0;
            while (lo<=hi)
            {
                int mid = lo + (hi-lo)/2;
                boolean res  = isValid(arr,mid,noc);

                if(res)
                {
                    ans = mid;
                    lo = mid+1;
                }
                else
                {
                    hi = mid-1;
                }
            }

            System.out.print(ans);
        }

    }

    public static boolean isValid(int[] arr , int mid,int noc)
    {
        int lastPosition = arr[0];
        int cow = 1;

        for(int i=1;i<arr.length;i++)
        {
            int dist = arr[i]-lastPosition;
            if (dist>=mid)
            {
                cow++;
                lastPosition = arr[i];
            }
        }

        if(cow>=noc)
        {
            return true;
        }

        return  false;
    }
}
