package BASIC.Conversions;

import java.util.Scanner;

public class OctalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int decimal = octalToDecimal(n);
        int binary = DecimalToBinary(decimal);
        System.out.print(binary);
    }

    public static int octalToDecimal(int n)
    {
        int sum = 0;
        int multi = 1;
        while(n>0)
        {
            int rem = n%10;
            sum = sum+(multi*rem);
            n = n/10;
            multi = multi*8;
        }
        return sum;
    }

    public static int DecimalToBinary(int n)
    {
        int sum = 0;
        int multi = 1;
        while(n>0)
        {
            int rem = n%2;
            sum = sum + (multi*rem);
            n = n/2;
            multi = multi*10;
        }
        return sum;
    }
}
