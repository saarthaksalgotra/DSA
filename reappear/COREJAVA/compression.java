package reappear.COREJAVA;

import java.util.Scanner;

public class compression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String res = sol(str);
        System.out.print(res);
    }

    public static String sol(String str)
    {
        if(str.length()==0)return "" ;
        char ch = str.charAt(0);
        int i = 1;
        while(i<str.length() && str.charAt(i)==ch)
        {
            i++;
        }

        String ros = str.substring(i);
        ros = sol(ros);

        String count = i+"";
        return ch+count+ros;
    }
}
