package BASIC.Maths;

import java.util.Scanner;

public class gcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int divisor = sc.nextInt(); //divisor
        int dividend = sc.nextInt(); //dividend
        while(dividend%divisor!=0)
        {
            int rem = dividend%divisor;
             dividend = divisor;
             divisor = rem;
        }
        System.out.println(divisor);
    }
}
