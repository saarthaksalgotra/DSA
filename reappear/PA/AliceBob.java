package reappear.PA;

import java.util.Scanner;

public class AliceBob {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int[] Alice = new int[n];
        int[] Bob = new int[n];

        for(int i=0;i<Alice.length;i++)
        {
            Alice[i] = sc.nextInt();
        }

        for(int i=0;i<Bob.length;i++)
        {
            Bob[i] = sc.nextInt();
        }

        int unhappy = 0;

        for(int i=0;i<n;i++)
        {
            if(Alice[i]> 2*Bob[i] || Bob[i] > 2*Alice[i])
            {
                unhappy++;
            }
        }

        int happy = n-unhappy;
        System.out.print(happy);

    }
}
