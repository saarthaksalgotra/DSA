package Assignment;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        char[] arr = str.toCharArray();

        int i = 0;
        int j = arr.length-1;

        while(i<=j)
        {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }

        for(char c : arr)
        {
            System.out.print(c+" ");
        }
    }
}
