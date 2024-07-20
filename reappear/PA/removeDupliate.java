package reappear.PA;

import java.util.Scanner;

public class removeDupliate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        StringBuilder sb = new StringBuilder(str);
        for(int i=0;i<sb.length()-1;i++)
        {
            if(sb.charAt(i)==sb.charAt(i+1))
            {
                sb.deleteCharAt(i);
            }
        }
        str = sb.toString();
        System.out.print(str);
    }
}
