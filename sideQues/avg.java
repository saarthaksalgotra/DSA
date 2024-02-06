package sideQues;

import java.util.Scanner;

public class avg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();
        average(a,b,c);
    }

    public static void average(int a,int b ,int c)
    {
        int avg = (a+b+c)/3;
        System.out.print(avg);
    }
    
}
