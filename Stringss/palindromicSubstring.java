package Stringss;
import java.util.*;
public class palindromicSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();

        //substrings loop
        int count = 0;
        for(int i=0;i<str.length();i++)
        {
            for(int j=i+1;j<=str.length();j++)
            {
                if(isPalidrome(str.substring(i,j)))
                {
                    System.out.print(str.substring(i,j)+" ");
                    count++;
                }
            }
           
        }
        System.out.println("Number of substring: "+count);
    } 
    public static boolean isPalidrome(String str)
    {
        int i = 0;
        int j = str.length()-1;

        while(i<j)
        {
            

            if(str.charAt(i)!=str.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}
