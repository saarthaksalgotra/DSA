package reappear.PA;

import java.util.ArrayList;
import java.util.Scanner;

public class LongestString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] arr = str.split("\\s+");
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }

        int maxLength = sol(list , 0);
        System.out.print(maxLength);
    }

    public static int sol(ArrayList<String> list , int idx)
    {

        if(idx == list.size())
        {
            return 0;
        }

        int CurrLength = list.get(idx).length();

        int restLength = sol(list,idx+1);

        return  Math.max(CurrLength,restLength);
    }
}
