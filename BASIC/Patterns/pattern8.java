package BASIC.Patterns;

import java.util.Scanner;

public class pattern8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        //int nst = 1;
        int nsp1 = 0;
        int nsp2= n-2;
        int row = 0;
        while(row<n)
        {
            //space
            for(int csp=0;csp<nsp1;csp++)
            {
                System.out.print("  ");
            }
            System.out.print("* ");
            //space2
            for(int csp=0;csp<nsp2;csp++)
            {
                System.out.print("  ");
            }
            if(row!=n/2) {
                System.out.print("* ");
            }
            row++;
            if(row<n-2)
            {
                nsp1++;
                nsp2=nsp2-2;
            }
            else
            {
                nsp1--;
                nsp2=nsp2+2;
            }
            System.out.println();
        }

    }
}
