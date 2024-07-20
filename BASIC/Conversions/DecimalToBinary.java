package BASIC.Conversions;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans =0;
        int multi=1;
        while(n>0)
        {
            int rem = n%2;
            n=n/2;
            ans=ans+rem*multi;
            multi=multi*10;
        }
        System.out.println(ans);
    }
}
