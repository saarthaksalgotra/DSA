package BASIC.Recursion;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = fibo(n);
        System.out.print(ans);
    }

    public static int fibo(int n)
    {
        if(n==0 || n==1)
        {
            return n;
        }
        int fh = fibo(n-1);
        int sh = fibo(n-2);
        int res = 0;
        res = fh+sh;
        return res;
    }
}
