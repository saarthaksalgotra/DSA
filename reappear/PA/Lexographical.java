package reappear.PA;

import java.util.Scanner;

public class Lexographical {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sol(n,0);
    }

    public static void sol(int n , int ans)
    {
        if(ans>n)
        {
            return;
        }
        System.out.print(ans+" ");
        if(ans==0)
        {
            for(int i=0;i<10;i++)
            {
                sol(n,ans*10+i);
            }
        }
        else
        {
            for(int i=1;i<10;i++)
            {
                sol(n,ans*10+i);
            }
        }
    }
}
