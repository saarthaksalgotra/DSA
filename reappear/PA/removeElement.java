package reappear.PA;

import java.util.LinkedList;
import java.util.Scanner;

public class removeElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<String> list = new LinkedList<>();
        int n = sc.nextInt();
        String[] arr = new String[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = sc.next();
        }

        String trgt = sc.next();

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i].compareTo(trgt)>0)
            {
                list.add(arr[i]);
            }
        }
        System.out.println(list);
    }
}
