package reappear.PA;

import java.util.Scanner;

public class oddeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
      
        int eSum=0;
        int oSum=0;
        while(n!=0) {

            int rem = n%10;
            if(rem%2==0)
            {
                eSum+=rem;
            }
            else
            {
                oSum+=rem;
            }
            n=n/10;
        }

        if(eSum%4==0 || oSum%3==0)
        {
            System.out.print("Yes");
        }
        else
        {
            System.out.print("No");
        }
    }
}
