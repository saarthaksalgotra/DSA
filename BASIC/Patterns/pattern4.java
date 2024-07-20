package BASIC.Patterns;

import java.util.Scanner;

public class pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nst = 1;
        int nsp = n-1;
        int row = 0;
        while(row<n)
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
            nst++;
            nsp--;
            System.out.println();
        }
    }
}
