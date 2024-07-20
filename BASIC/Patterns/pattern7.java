package BASIC.Patterns;

import java.util.Scanner;

public class pattern7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nst = 5;
        int nsp = 3;
        int row=0;
        while(row<n)
        {
            if(row==0)
            {
                for(int cst=0;cst<nst;cst++)
                {
                    System.out.print("* ");
                }
            } else if (row==n-1) {
                for(int cst=0;cst<nst;cst++)
                {
                    System.out.print("* ");
                }
            }
            else
            {
                System.out.print("* ");
                //space
                for(int csp=0;csp<nsp;csp++)
                {
                    System.out.print("  ");
                }

                System.out.print("*");
            }
            row++;
            System.out.println();
        }
    }
}
