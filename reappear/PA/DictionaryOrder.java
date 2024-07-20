package reappear.PA;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class DictionaryOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        ArrayList<String> list = new ArrayList<>();
        sol(str,list,"");
        Collections.sort(list);
        for(int i=0;i<list.size();i++)
        {
            if(str.compareTo(list.get(i))>0)
            {
                System.out.print(list.get(i)+" ");
            }
        }
//        System.out.println(list.get(list.size()-1));
    }

    public static void sol(String str , ArrayList<String> list , String ans)
    {
        if(str.isEmpty())
        {
            list.add(ans);
            return;
        }
        for(int i=0;i<str.length();i++)
        {
            sol(str.substring(0,i)+str.substring(i+1),list,ans+str.charAt(i));
        }
    }
}
