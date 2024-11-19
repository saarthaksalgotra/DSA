package Assignment;

import java.util.Arrays;
import java.util.Scanner;

public class Q2 {
    public static boolean[] kidsWithCandies(int[] candies, int extraCandies) {
        int n = candies.length;
        int maxCandies = 0;
        int[] ans = candies;
        int i = candies.length;

        for(int j = 0; j < i; j++) {
            int candy = ans[j];
            maxCandies = Math.max(maxCandies, candy);
        }

        boolean[] result = new boolean[n];

        for(i = 0; i < n; ++i) {
            result[i] = candies[i] + extraCandies >= maxCandies;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] candies = new int[n];
        for (int i=0;i<candies.length;i++)
        {
            candies[i] = sc.nextInt();
        }
        int extraCandies = sc.nextInt();
        boolean res[] = kidsWithCandies(candies,extraCandies);

        for(int i=0;i< res.length;i++)
        {
            System.out.print(res[i]+" ");
        }
    }
}
