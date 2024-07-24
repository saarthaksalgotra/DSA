package BASIC.String;

import java.util.Scanner;

public class subsequence {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        sol(str,0,"");
    }

    public static void sol(String str , int idx , String ans)
    {

        if(idx==str.length())
        {
            System.out.print(ans+" ");
            return;
        }
        sol(str,idx+1,ans);
        sol(str, idx+1, ans+str.charAt(idx));
        sol(str,idx+1,ans+(int)str.charAt(idx));

    }
}
