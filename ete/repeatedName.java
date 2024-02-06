package ete;

import java.util.*;

public class repeatedName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toLowerCase();
        String word = sc.nextLine().toLowerCase();

        int res = sol(str,word);
        System.out.print(res);
        sc.close();
    }


    public static int sol(String str , String word)
    {
        int count = 0;

        for(int i=0;i<=str.length()-word.length();i++)
        {
            if(str.substring(i, i+word.length()).equals(word))
            {
                count++;
            }
        }
        return count;
    }
}