package sideQues;

import java.util.Scanner;

public class even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();

        boolean res = isEven(num);
        System.out.print(res);

    }

    public static boolean isEven(int num)
    {
        if(num%2==0)
        {
            return true;
        }

        return false;
    }
    
}
