package BASIC.Patterns;

import java.util.Scanner;

public class pattern14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nst = 1;
        int nsp = n-1;
        int row = 0;
        while(row<n*2-1)
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
            if(row<n)
            {
                nst++;
                nsp--;
            }
            else {
                nst--;
                nsp++;
            }
            System.out.println();
        }
    }
}
