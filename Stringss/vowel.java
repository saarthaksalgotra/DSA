package Stringss;

import java.util.Scanner;

public class vowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        int count = 0;
        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);

            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
            {
                count++;
            }
        }

        System.out.print("No of lowercase vowels: "+count);
    }
    
}
