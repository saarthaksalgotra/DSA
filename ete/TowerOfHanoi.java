package ete;

import java.util.Scanner;

public class TowerOfHanoi {
    public static int cnt = 0;
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        sc.close();
        sol(n,"T1","T3","T2");
        System.out.println(cnt);
    }

    public static void sol(int n,String from_tower,String to_tower,String helper)
    {
        if(n==0)
        {
            return;
        }

        sol(n-1,from_tower,helper,to_tower);
        System.out.println("Move "+n+"th disc from "+from_tower+" to "+to_tower);
        cnt++;
        sol(n-1,helper,to_tower,from_tower);
        
    }
}