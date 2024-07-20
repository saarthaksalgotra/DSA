package reappear.COREJAVA;

import java.util.Scanner;

public class stringreverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String res = sol(str);
        System.out.print(res);
    }

    public static String sol(String str)
    {
        String[] arr = str.trim().split("\\s+");
        String ans = "";
        for(int i=arr.length-1;i>0;i--)
        {
            ans+=arr[i]+" ";
        }

        return ans+arr[0];
    }
}
