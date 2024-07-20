package BASIC.Patterns;

import java.util.Scanner;

public class pattern17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nst = n/2;
        int nsp = 1;
        int row = 0;
        while(row < n)
        {
            //star
            if(row!=n/2) {
                for (int cst = 0; cst < nst; cst++) {
                    System.out.print("* ");
                }
            }
            //space
            for(int csp = 0 ; csp < nsp ; csp++ )
            {
                System.out.print("  ");
            }
            //star
            if(row!=n/2)
            {
                for(int cst = 0; cst < nst ; cst++)
                {
                    System.out.print("* ");
                }
            }

            row++;
            if(row<n/2+1)
            {
                nst--;
                nsp +=2;
            }
            else {
                nst++;
                nsp-=2;
            }
            System.out.println();
        }
    }
}
