package BASIC.Patterns;

import java.util.Scanner;

public class pattern16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nol = n*2-1;
        int nst = n;
        int nsp = n-1;
        int row = 0;
        while(row<nol)
        {
            //space
            for(int csp=0;csp<nsp;csp++)
            {
                System.out.print("  ");
            }

            //star
            for(int cst=0;cst<nst;cst++)
            {
                System.out.print("* ");
            }

            row++;
            if(row<nol/2+1)
            {
                nst--;
                nsp--;
            }
            else
            {
                nst++;
                nsp++;
            }
            System.out.println();
        }
    }
}
