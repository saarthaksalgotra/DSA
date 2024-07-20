package BASIC.Patterns;

import java.util.Scanner;

public class pattern22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int nst =n-1;
        int nsp = 1;
        int row = 0;
        for(int cst = 0; cst<n*2-1;cst++)
        {
            System.out.print("* ");
        }
        System.out.println();
        while(row<n)
        {
                for(int cst = 0 ;cst<nst;cst++)
                {
                    System.out.print("* ");
                }

                for(int csp =0 ;csp<nsp;csp++)
                {
                    System.out.print("  ");
                }
                for(int cst = 0 ;cst<nst;cst++)
                {
                    System.out.print("* ");
                }
            row++;
            nst--;
            nsp+=2;
            System.out.println();
        }
    }
}
