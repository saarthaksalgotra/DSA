package reappear.PA;

import java.util.Scanner;

public class wildcards {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sol(str,0);
    }

    public static void sol(String str,int idx)
    {

        if(idx==str.length())
        {
            System.out.print(str+" ");
            return;
        }

        char ch = str.charAt(idx);

        if(ch=='?')
        {
            sol(str.substring(0,idx)+'0'+str.substring(idx+1),idx+1);
            sol(str.substring(0,idx)+'1'+str.substring(idx+1),idx+1);
        }
        else
        {
            sol(str,idx+1);
        }
    }
}
