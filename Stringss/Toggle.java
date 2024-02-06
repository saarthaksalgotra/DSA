package Stringss;
import java.util.*;
public class Toggle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.nextLine());
        sc.close();
        for(int i=0;i<sb.length();i++)
        {
            boolean flag = true;
            if(sb.charAt(i)==' ')continue;
            int ascii = (int)sb.charAt(i);

            if(ascii>=97) flag = false;

            if(flag==true)
            {
                ascii+=32;
                char ch = (char)ascii;
                sb.setCharAt(i, ch);
            }
            else{
                ascii -=32;
                char ch = (char)ascii;
                sb.setCharAt(i,ch);
            }
        }
        System.out.print(sb);
    }
    
}
