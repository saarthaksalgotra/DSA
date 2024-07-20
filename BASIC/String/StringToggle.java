package BASIC.String;

import java.util.Scanner;

public class StringToggle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String ans = "";
        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            int ascii = (int)ch;
            if(ascii>=97)
            {
                ascii-=32;
                ch = (char)ascii;
                ans+=ch;
            }
            else
            {
                ascii+=32;
                ch = (char)ascii;
                ans+=ch;
            }
        }

            System.out.print(ans);
    }
}
