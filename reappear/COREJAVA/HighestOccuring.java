package reappear.COREJAVA;

import java.util.Scanner;

public class HighestOccuring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] arr = str.toCharArray();
        int cnt = 1;
        String ans ="";
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]==arr[i+1])
            {
                cnt++;
                ans+=arr[i];
                break;
            }
        }

        System.out.print(cnt +" "+ans);
    }
}
