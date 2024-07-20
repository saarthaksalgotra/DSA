package ADS;

import java.util.*;

public class permutations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        //sol(str,"");
        withoutduplicate(str,"");

    }

    public static void sol(String str , String ans)
    {
        if(str.length()==0)
        {
            System.out.println(ans);
            return;
        }
        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            String res = str.substring(0, i)+str.substring(i+1);
            sol(res,ans+ch);
        }
    }

    public static void withoutduplicate(String str , String ans)
    {
        if(str.length()==0)
        {
            System.out.println(ans);
            return;
        }
        HashSet<Character> set = new HashSet<>();
        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if(!set.contains(ch))
            {
                set.add(ch);
                String res = str.substring(0, i)+str.substring(i+1);
                withoutduplicate(res,ans+ch);
            }
        }
    }    
}