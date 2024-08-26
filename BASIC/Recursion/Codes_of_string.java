package BASIC.Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class Codes_of_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        ArrayList<String> list = new ArrayList<>();
        sol(str,list,"");
        System.out.print(list);
    }

    public static void sol(String str,ArrayList<String> list,String ans)
    {
        if(str.isEmpty())
        {
            list.add(ans);
            return;
        }
        for(int i=0;i<str.length();i++)
        {
            String curr = str.substring(0,i+1);
            String rem = str.substring(i+1);
            int val = Integer.parseInt(curr);
            if(val>26)
            {
                return;
            }
            char ch = (char)(val+96);
            sol(rem,list,ans+ch);
        }
    }
}
