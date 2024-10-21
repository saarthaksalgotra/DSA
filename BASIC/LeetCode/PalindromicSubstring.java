package BASIC.LeetCode;

import java.util.Scanner;

public class PalindromicSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int ans = sol(str);
        System.out.println(ans);
    }

    public static int sol(String str)
    {
        int cnt = 0;
        for(int i=0;i<str.length();i++)
        {
            cnt +=1;
            int orbit = 1;
            while(i-orbit>=0 && i+orbit < str.length())
            {
                if(str.charAt(i-orbit)==str.charAt(i+orbit))
                {
                    cnt++;
                }
                else
                {
                    break;
                }
                orbit++;
            }
        }

        for(double i=0.5;i<str.length();i++)
        {
            double orbit = 0.5;
            while(i-orbit>=0 && i+orbit < str.length())
            {
                if(str.charAt((int)(i-orbit))==str.charAt((int)(i+orbit)))
                {
                    cnt++;
                }
                else
                {
                    break;
                }
                orbit += 0.5;
            }
        }

        return cnt;
    }
}
