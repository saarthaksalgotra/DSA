package reappear.PA;

import java.util.Scanner;

public class CostOfGroceries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int freshness = sc.nextInt();

        int[] A = new int[n];  //freshness level
        int[] B = new int[n];  // cost

        for(int i=0;i<A.length;i++)
        {
            A[i] = sc.nextInt();
        }

        for(int i=0;i<B.length;i++)
        {
            B[i] = sc.nextInt();
        }

        int cost = 0;
        for(int i=0;i<B.length;i++)
        {
            if(A[i]>=freshness)
            {
                cost += B[i];
            }
        }

        System.out.println(cost);
    }
}
