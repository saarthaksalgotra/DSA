package BASIC.Recursion;

import java.util.Scanner;

public class power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();

        int res = sol(n,x);
        System.out.print(res);
    }

    public static int sol(int n , int x)
    {
        if(x==0)
        {
            return 1;
        }

        int ans = n*sol(n,x-1);
        return ans;
    }
}
