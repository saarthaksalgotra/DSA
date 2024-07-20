package BASIC.String;

import java.util.Scanner;

public class StringCompression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        String ans = "";
        int strt = 0;
        int end = 1;
        while(end-1<str.length())
        {
            while (str.length()>end && str.charAt(strt)==str.charAt(end))
            {
                end++;
            }
            ans = ans+str.charAt(strt)+(end-strt);
            strt = end;
            end = strt+1;

        }
        System.out.print(ans);
    }
}
