package Stringss;

import java.util.*;

public class anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        sc.close();

        char[] arr1 = s1.toCharArray();
        Arrays.sort(arr1);
        char[] arr2 = s2.toCharArray();
        Arrays.sort(arr2);

        boolean ans = Arrays.equals(arr1,arr2);

        if(ans)
        {
            System.out.print("Anagram");
        }
        else
        {
            System.out.print("Not Anagram");
        }


    }
    
}
