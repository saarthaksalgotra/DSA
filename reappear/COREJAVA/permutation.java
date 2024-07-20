package reappear.COREJAVA;

import java.util.Arrays;
import java.util.Scanner;

public class permutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        char[] a = str1.toCharArray();
        char[] b = str2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        boolean res = Arrays.equals(a,b);

        if(res)
        {
            System.out.print("1");
        }
        else
        {
            System.out.print("0");
        }
    }
}
