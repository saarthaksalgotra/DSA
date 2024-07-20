package reappear.PA;

import java.util.Scanner;

public class SudukoSolver {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int arr[][]=new int[n][n];
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                arr[i][j]=scn.nextInt();
            }
        }
        sol(0,0,arr);
    }
    public static void sol(int cr,int cc,int arr[][]) {

        if(cr==8 && cc==9)
        {
            display(arr);
            return;
        }

        if(cc>8)
        {
            sol(cr+1,0,arr);
            return;
        }

        if(cr>8)
        {
            return;
        }

        if(arr[cr][cc]==0)
        {
            for(int i=1;i<=9;i++)
            {
                if(isValid(cr,cc,i,arr))
                {
                    arr[cr][cc]=i;
                    sol(cr,cc+1,arr);
                    arr[cr][cc]=0;
                }
            }
        }
        else
        {
            sol(cr,cc+1,arr);
        }
    }
    public static void display(int[][] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static boolean isValid(int cr , int cc , int val , int[][] arr)
    {

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i][cc]==val || arr[cr][i]==val)
            {
                return false;
            }
        }

        int row = cr%3;
        row = cr-row;
        int col = cc%3;
        col = cc-col;

        for(int i=row;i<row+3;i++)
        {
            for(int j=col;j<col+3;j++)
            {
                if(arr[i][j]==val)
                {
                    return false;
                }
            }
        }
        return true;
    }

}
