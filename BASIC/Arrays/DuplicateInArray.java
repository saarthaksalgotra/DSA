package BASIC.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class DuplicateInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n =sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }

         System.out.print(sol(arr));
    }

    public static List<Integer> sol(int[] arr)
    {
        Arrays.sort(arr);
        ArrayList<Integer> List = new ArrayList<Integer>();
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]==arr[i+1])
            {
                if(!List.contains(arr[i]))
                {
                    List.add(arr[i]);
                }
            }
        }
        return List;
    }
}
