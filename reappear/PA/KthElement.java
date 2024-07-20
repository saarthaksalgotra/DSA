package reappear.PA;

import java.util.LinkedList;
import java.util.Scanner;

public class KthElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();

        while (true)
        {
            int n = sc.nextInt();
            if(n==-1)
            {
                break;
            }
            else
            {
                list.add(n);
            }
        }
        int k = sc.nextInt();
        int ans = list.get(list.size()-k);
        System.out.print(ans);
    }
}