package ADS;

import java.util.ArrayList;
import java.util.Scanner;

public class stringcode {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        sc.close();
        ArrayList<String> list = new ArrayList<String>();
        sol(str,"",list);
        System.out.print(list);
    }

    public static void sol(String str,String ans,ArrayList<String> list)
    {
        if(str.length()==0)
        {
            list.add(ans);
            return;
        }
        for(int i=1;i<=str.length();i++)
        {
            String str1=str.substring(0,i);
            int val=Integer.parseInt(str1);
            if(val>26)
            {
                return;
            }
            char ch=(char)(96+val);


            String rem=str.substring(i);
            sol(rem,ans+ch,list);
        }
    }
}
