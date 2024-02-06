package sideQues;

import java.util.Scanner;
public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        boolean ans=isPrime(n);
        System.out.println(ans);
    }

    public static boolean isPrime(int n){
        if(n==1 || n==0)
        {
            return false;
        }
        // for(int i=2;i<n;i++)
        for(int i=2;i<Math.sqrt(n);i++)  // => optimal
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
}
