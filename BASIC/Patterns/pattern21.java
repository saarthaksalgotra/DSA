package BASIC.Patterns;

import java.util.Scanner;

public class pattern21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nst = 1;
        int nsp = n+2;
        int row = 0;
        while(row<n)
        {
            if(row==n-1)
            {
                for(int cst = 0;cst<n*2-1;cst++)
                {
                    System.out.print("* ");
                }
            }
            else
            {
                for(int cst = 0 ;cst<nst;cst++)
                {
                    System.out.print("* ");
                }
                for(int csp = 0;csp<nsp;csp++)
                {
                    System.out.print("  ");
                }
                for(int cst = 0 ;cst<nst;cst++)
                {
                    System.out.print("* ");
                }
            }
            row++;
            nst++;
            nsp-=2;
            System.out.println();
        }
    }
}
