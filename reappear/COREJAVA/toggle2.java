package reappear.COREJAVA;

import java.util.Scanner;

public class toggle2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] arr = str.toCharArray();

        for(int i=0;i<arr.length;i++)
        {
            if(Character.isUpperCase(arr[i]))
            {
                arr[i] = Character.toLowerCase(arr[i]);
            }
            else
            {
                arr[i] = Character.toUpperCase(arr[i]);
            }
        }

        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]);
        }
    }
}
