package Infosys;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class WallDRY {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }

        int k=sc.nextInt();
        int ans = minMinutes(arr,k);
        System.out.print(ans);

    }

    public  static int minMinutes(int[] arr , int k)
    {

        int time = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder()) ;

        for(int ele:arr)
        {
            pq.add(ele);
        }

        while(!pq.isEmpty())
        {
            int mw = pq.remove();  // max Wall
            if (mw-time<=0)
            {
                return time;
            }
            else if(pq.isEmpty())
            {
                return time +(int)Math.ceil((mw-time)/(k*1.0));
            }
            else
            {
                mw = mw-time-k;
                time++;
                while (mw>pq.peek())
                {
                    mw = mw-k;
                    time++;
                }
                pq.add(mw);
            }
        }
        return time;
    }
}

// BRUTE  max ele ko sirf minus k kro aur baaki element ko ele-time-k