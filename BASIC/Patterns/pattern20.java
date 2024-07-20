package BASIC.Patterns;

import java.util.Scanner;

public class pattern20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nsp1 = n / 2;
        int nsp2 = 1;
        int row = 0;
        while (row < n) {
            // space
            for (int csp = 0; csp < nsp1; csp++) {
                System.out.print(" ");
            }
            // star
            System.out.print("*");
            // space2
            for (int csp = 0; csp < nsp2; csp++) {
                System.out.print(" ");
            }

            if (nsp2 > 1) {
                System.out.print("*");
            }

            System.out.println();

            if (row < n / 2) {
                nsp1--;
                nsp2 +=2;
            } else {
                nsp1++;
                nsp2 -=2;
            }
            row++;
        }
    }
}
