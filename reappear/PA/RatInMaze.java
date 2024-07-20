package reappear.PA;

import java.util.Scanner;

public class RatInMaze {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char [][] arr ={{'o','o','x'},{'o','o','o'},{'o','o','o'},{'o','x','o'}};
        int ans = sol(arr,0,0,arr.length-1,arr[0].length-1,"", new int[arr.length][arr[0].length]);
        System.out.println();
        System.out.println(ans);
    }

    public static int sol(char[][]arr , int cr , int cc , int er , int ec,String ans , int visited[][])
    {

        if(cr<0 || cc<0 ||cr>er || cc>ec || arr[cr][cc]=='x' || visited[cr][cc]==1)
        {
            return 0;
        }

        if(cr==er && cc == ec)
        {
            for(int i=0;i<arr.length;i++)
            {
                for(int j =0;j<arr[0].length;j++)
                {
                    System.out.print(visited[i][j]+" ");
                }
                System.out.println();
            }
            System.out.println();
            return 1;
        }
        visited[cr][cc] = 1;
        int cnt = 0;
        cnt += sol(arr, cr + 1, cc, er, ec, ans + 'D',visited);
        cnt += sol(arr, cr, cc + 1, er, ec, ans + 'R',visited);
        cnt += sol(arr , cr-1 , cc , er, ec,ans+'U',visited);
        cnt += sol(arr , cr, cc-1 , er , ec , ans+'L',visited);
        visited[cr][cc] = 0;
        return cnt;
    }
}