package reappear.COREJAVA;

import java.util.Scanner;

public class toggle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.nextLine());


        for(int i=0;i<sb.length();i++)
        {
            boolean flag = true;
            int ascii = (int)sb.charAt(i);
            if(ascii>=97) flag = false;

            if(flag==true)
            {
                ascii+=32;
                char ch = (char)ascii;
                sb.setCharAt(i,ch);
            }
            else
            {
                ascii-=32;
                char ch = (char)ascii;
                sb.setCharAt(i,ch);
            }
        }

        System.out.print(sb);


    }
}