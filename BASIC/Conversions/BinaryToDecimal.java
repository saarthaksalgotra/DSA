package BASIC.Conversions;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int multi = 1;
        int n = sc.nextInt();

        while(n>0)
        {
            int rem = n%10;
            sum = sum + (multi*rem);
            n=n/10;
            multi = multi*2;
        }

        System.out.print(sum);
    }
}
