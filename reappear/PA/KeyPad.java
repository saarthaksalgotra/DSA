package reappear.PA;

import java.util.Scanner;

public class KeyPad {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        String str = sc.next();
        sol(str,"");
    }

    public static void sol(String str , String ans)
    {

        if(str.isEmpty())
        {
            System.out.println(ans);
            return;
        }
        char ch = str.charAt(0);
        String alpha = get(ch);
        for(int i=0;i<alpha.length();i++)
        {
            sol(str.substring(1),ans+alpha.charAt(i));
        }
    }

    public static String get(char ch)
    {
        if(ch=='2')
        {
            return "abc";
        }
        if(ch=='3')
        {
            return "def";
        }
        if(ch=='4')
        {
            return "ghi";
        }
        if(ch=='5')
        {
            return "jkl";
        }
        if(ch=='6')
        {
            return "mno";
        }
        if(ch=='7')
        {
            return "pqrs";
        }
        if(ch=='8')
        {
            return "tuv";
        }
        if(ch=='9')
        {
            return "wxyz";
        }

        return "";

    }
}
