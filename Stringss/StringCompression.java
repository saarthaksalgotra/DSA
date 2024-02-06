package Stringss;

import java.util.Scanner;

public class StringCompression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();

        String ans =""+str.charAt(0);
        int count = 1;
        for(int i=1;i<str.length();i++)
        {

            char curr =str.charAt(i);
            char prev =str.charAt(i-1);
            if(curr==prev)
            {
                count++;
            }
            else
            {
                if(count>1)ans+=count;
                count=1;
                ans+=curr;
            }
        }

        if(count>1)ans+=count;
        System.out.print(ans);
    }
    
}
