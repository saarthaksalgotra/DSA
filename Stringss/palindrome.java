package Stringss;
import java.util.*;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.close();
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();

       String s = sb+"";

        if(str.equals(s))
        {
            System.out.print("Is Palindrome");
        }
        else{
            System.out.print("Not a Palindrome");
        }    
    }
}