package BASIC.Patterns;

import java.util.Scanner;

public class pattern15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nol = n*2-1;   // No of lines;
        int nst = n;
        int nsp = 0;
        int row = 0;
        while(row<nol)
        {
            //space
            for(int csp = 0 ; csp < nsp ; csp++)
            {
                System.out.print("  ");
            }
            //star
            for(int cst = 0 ; cst < nst ; cst++)
            {
                System.out.print("* ");
            }

            row++;
            if(row < nol/2+1)
            {
                nst--;
                nsp+=2;
            }
            else
            {
                nst++;
                nsp-=2;
            }
            System.out.println();
        }
    }
}
