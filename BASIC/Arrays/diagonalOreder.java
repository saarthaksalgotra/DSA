package BASIC.Arrays;

import java.util.Scanner;

public class diagonalOreder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][]arr = new int[n][n];

        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }

        sol(arr);
    }

    public static void sol(int[][] arr)
    {
        int nod = arr.length*arr[0].length-1;
        int dp = 0;
        int row = 0;
        int col = -1;
        while(dp<nod)
        {
            if(col+1>=arr[0].length)
            {
                row++;
            }
            else
            {
                col++;
            }
            print(arr,row,col);
            dp++;
        }
    }

    public static void print(int[][] arr, int row, int col)
    {
        int i=row;
        int j=col;
        while(i<arr.length&&j>=0)
        {
            System.out.print(arr[i][j]+" ");
            i++;
            j--;
        }
    }
}
