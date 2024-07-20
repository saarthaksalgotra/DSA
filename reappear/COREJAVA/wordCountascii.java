package reappear.COREJAVA;

import java.util.Scanner;

public class wordCountascii {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String[] arr = str.split("\\s+");
        int cnt = arr.length;
        System.out.print(cnt + " ");

        for(String word:arr)
        {
            char ch = word.charAt(0);
            int ascii = (int)ch;
            System.out.print(ch+""+ascii+" ");
        }
    }
}
