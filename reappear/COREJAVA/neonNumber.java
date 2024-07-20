package reappear.COREJAVA;

import java.util.Scanner;

public class neonNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(isNeon(n))
        {
            System.out.print("It is Neon Number");
        }
        else
        {
            System.out.print("Not a Neon Number");
        }
    }
    public static boolean isNeon(int n)
    {
        int sq = n*n;
        int sum = 0;
        while(sq>0)
        {
            int rem = sq%10;
            sum =sum+rem;
            sq = sq/10;
        }

        if(sum==n)
        {
            return true;
        }

        return false;
    }
}
