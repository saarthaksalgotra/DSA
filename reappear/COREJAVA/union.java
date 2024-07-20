package reappear.COREJAVA;

import java.util.HashSet;
import java.util.Scanner;

public class union {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m =sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        for(int i=0;i<a.length;i++)
        {
            a[i] = sc.nextInt();
        }

        for(int i=0;i<b.length;i++)
        {
            b[i] = sc.nextInt();
        }

        int res =sol(a,b);
        System.out.print(res);
    }

    public static int sol(int[] a , int[] b)
    {
        HashSet<Integer> set = new HashSet<>();

        for(int i=0;i<a.length;i++)
        {
            set.add(a[i]);
        }

        for(int i=0;i<b.length;i++)
        {
            set.add(b[i]);
        }

        return set.size();
    }
}
