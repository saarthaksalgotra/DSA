package reappear.COREJAVA;

import java.util.*;

public class NothingCommon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        String res = sol(str1,str2);
        System.out.print(res);
    }

    public static String sol(String A , String B)
    {
        HashSet<Character> set1 = new HashSet<Character>();
        HashSet<Character> set2 = new HashSet<Character>();
        ArrayList<Character> list = new ArrayList<>();

        for(int i = 0;i<A.length();i++)
        {
            char ch = A.charAt(i);
            set1.add(ch);
        }

        for(int i = 0;i<B.length();i++)
        {
            char ch = B.charAt(i);
            set2.add(ch);
        }

        for(int i=0;i<A.length();i++)
        {
            char ch = A.charAt(i);
            if(!set2.contains(ch))
            {
                if(!list.contains(ch))
                {
                    list.add(ch);
                }
            }
        }

        for(int i=0;i<B.length();i++)
        {
            char ch = B.charAt(i);
            if (!set1.contains(ch)) {
                if (!list.contains(ch)) {
                    list.add(ch);
                }
            }
        }

        if(list.size()==0)
        {
            return "-1";
        }

        Collections.sort(list);

        String ans = "";
        for(char ch:list)
        {
            ans+=ch;
        }

        return ans;
    }
}
