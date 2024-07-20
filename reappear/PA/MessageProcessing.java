package reappear.PA;

import java.util.Scanner;

public class MessageProcessing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.replaceAll(" ","");
        str = str.toUpperCase();

        String ans = ""+str.charAt(0)+str.substring(1).toLowerCase();
        System.out.print(ans);
    }
}
