package BASIC.Patterns;

import java.util.Scanner;

public class pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nst = 1;
        int row=0;
        while(row<n)
        {
            for(int cst=0;cst<nst;cst++)
            {
                System.out.print("* ");
            }
            row++;
            nst++;
            System.out.println();
        }
    }
}
