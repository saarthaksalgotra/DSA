package reappear.COREJAVA;

import java.util.Scanner;

public class binaryNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            int res = binary(i);
            System.out.println(res);
        }
    }

    public static int binary(int n)
    {
        int ans =0;
        int multi = 1;
        while(n>0)
        {
            int rem = n%2;
            ans = ans+multi*rem;
            multi = multi*10;
            n = n/2;
        }

        return ans;
    }
}
