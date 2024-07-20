package BASIC.Patterns;

import java.util.Scanner;

public class pattern13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nst = 1;
        int row = 0;
        while(row<n*2-1)
        {
            for(int cst=0;cst<nst;cst++)
            {
                System.out.print("* ");
            }

            row++;
            if(row<n)
            {
                nst++;
            }
            else
            {
                nst--;
            }
            System.out.println();
        }
    }
}
