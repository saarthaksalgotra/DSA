package ete;

import java.util.*;

public class MinSwaps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int [] arr = new int[n];

        for(int i=0;i<arr.length;i++)
        {
            arr[i] =sc.nextInt();
        }

        System.out.print(sol(arr));
        sc.close();
    }   
    
    public static int sol(int[] arr)
    {
        int len = arr.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<len;i++)
        {
            map.put(arr[i],i);
        }
        Arrays.sort(arr);
        boolean[] visited = new boolean[len];

        Arrays.fill(visited,false);

        int ans = 0;
        for(int i=0;i<len;i++)
        {
            if(visited[i] || map.get(arr[i])==i )
            {
                continue;
            }
            int j=i;
            int cycle = 0;
            while(!visited[j])
            {
                visited[j]=true;
                j=map.get(arr[j]);
                cycle++;
            }

            if(cycle>0)
            {
                ans+=(cycle-1);
            }
        }
        return ans;
    }
}