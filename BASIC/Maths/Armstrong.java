package BASIC.Maths;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int number = n;
        int sum = 0;
        while(n>0)
        {
            int rem = n%10;
            n = n/10;
            sum = sum + (rem*rem*rem);
        }
        //System.out.println(sum);
        if(sum==number)
        {
            System.out.print("Armstrong");
        }
        else
        {
            System.out.println("Not Armstrong");
        }
    }
}
