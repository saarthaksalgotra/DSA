package BASIC.Maths;

import java.util.Scanner;

public class countDigit {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n =sc.nextInt();
        int cnt=0;
        while(n>0)
        {
            int rem = n%10;
            n = n/10;
            cnt++;
        }
        System.out.print(cnt);
    }
}
