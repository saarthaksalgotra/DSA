package BASIC.LeetCode;

import java.util.Scanner;

public class Transpose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr = new int[n][m];

        for(int i=0;i<arr.length;i++)
        {
            for(int j = 0;j<arr[0].length;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }


        int[][] res = new int[arr[0].length][arr.length];

        for(int i=0;i<res.length;i++)
        {
            for(int j=0;j<res[0].length;j++)
            {
                res[i][j] = arr[j][i];
            }
        }

        for(int i=0;i<res.length;i++)
        {
            for(int j = 0;j<res[0].length;j++)
            {
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
    }
}
