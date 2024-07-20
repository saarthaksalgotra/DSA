package BASIC.Maths;

import java.util.Scanner;

public class PrimeFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int digitsum = digitSum(n);
        int primesum = primeFactorSum(n);
        System.out.println(primesum);

        if(digitsum==primesum)
        {
            System.out.print("1");
        }
        else
        {
            System.out.print("0");
        }
    }

    public static int digitSum(int n)
    {
        int ans = 0;
        while(n>0)
        {
            int rem = n%10;
            ans = ans+rem;
            n = n/10;
        }
        return ans;
    }

    public static int primeFactorSum(int n)
    {
        int ans = 0;
        for(int i=2;i<n;i++)
        {
            while(n%i==0)
            {
                ans = ans*10+i;
                n=n/i;
            }
        }

        if(n>=10)
        {
            ans = ans*100+n;
        }
        else
        {
            ans = ans*10+n;
        }
        //int sum = digitSum(ans);
        return ans;
    }
}
