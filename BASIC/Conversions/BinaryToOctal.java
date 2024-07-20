package BASIC.Conversions;

import java.util.Scanner;

public class BinaryToOctal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int decimal = BinaryToDecimal(n);
        int octal = DecimalToOctal(decimal);
        System.out.print(octal);
    }

    public static int BinaryToDecimal(int n)
    {
        int multi = 1;
        int sum = 0;
        while(n>0)
        {
            int rem = n%10;
            sum = sum + (multi*rem);
            n = n/10;
            multi = multi*2;
        }
        return sum;
    }

    public static int DecimalToOctal(int n)
    {
        int sum = 0;
        int multi = 1;
        while(n>0)
        {
            int rem = n%8;
            sum = sum + (multi*rem);
            n = n/8;
            multi = multi*10;
        }
        return sum;
    }
}
