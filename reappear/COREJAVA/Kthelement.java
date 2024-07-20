package reappear.COREJAVA;

import java.util.ArrayList;
import java.util.Scanner;

public class Kthelement {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        ArrayList<Integer> arr = new ArrayList<Integer>();
        while(true)
        {
            int n = sc.nextInt();
            if(n==-1)break;
            else
            {
                arr.add(n);
            }
        }

        int k = sc.nextInt();

        int res = arr.get(arr.size()-k);
        System.out.print(res);
    }
}
