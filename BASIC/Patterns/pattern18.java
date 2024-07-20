package BASIC.Patterns;

import java.util.Scanner;

public class pattern18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nst = 1;
        int nsp = n/2;
        int row = 0;
        while(row<n)
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
            if(row<=n/2)
            {
                nst+=2;
                nsp--;
            }
            else
            {
                nst-=2;
                nsp++;
            }
            System.out.println();
        }
    }
}
