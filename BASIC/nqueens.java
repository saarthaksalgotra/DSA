package BASIC;

import java.util.Scanner;

public class nqueens {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int ans = sol(0,0,n,n,0,n,new boolean[n][n]);
        System.out.print(ans);
    }

    public static int sol(int cr,int cc,int er,int ec,int qpsf,int tq, boolean[][] visited)
    {

        int cnt =0;

        if(tq==qpsf)
        {
            return 1;
        }

        if(cc>=ec)
        {
            return sol(cr+1,0,er,ec,qpsf,tq,visited);
        }

        if(cr>=er || (er-cr<tq-qpsf))
        {
            return 0;
        }


        if(isValid(cr,cc,er,ec,visited))
        {
            visited[cr][cc]=true;
            cnt+= sol(cr+1,0,er,ec,qpsf+1,tq,visited);
            visited[cr][cc]=false;
        }

        cnt+=sol(cr,cc+1,er,ec,qpsf,tq,visited);

        return cnt;
    }

    public static boolean isValid(int cr, int cc , int er ,int ec, boolean[][] visited)
    {

        for(int i=cr;i>=0;i--)
        {
            if(visited[i][cc])
            {
                return false;
            }
        }

        for(int i=cr,j=cc;i>=0&&j>=0;i--,j--)
        {
            if(visited[i][j])
            {
                return false;
            }
        }
        for(int i=cr,j=cc;i>=0&&j<ec;i--,j++)
        {
            if(visited[i][j])
            {
                return false;
            }
        }
        return true;
    }
}
