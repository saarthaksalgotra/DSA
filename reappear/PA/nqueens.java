package reappear.PA;

import java.util.Scanner;

public class nqueens {
    public static void main(String args[]) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        System.out.println(sol(0,n,0,n,n,0,new boolean[n][n]));
    }
    public static int sol(int cr,int er,int cc,int ec,int tq,int qpsf,boolean visited[][])
    {
        int cnt=0;
        if(tq==qpsf)
        {
            return 1;
        }
        if(cc>=ec)
        {
            return sol(cr+1,er,0,ec,tq,qpsf,visited);
        }
        if(cr>=er||(er-cr<tq-qpsf))
        {
            return 0;
        }
        if(isSafe(cr,er,cc,ec,visited))
        {
            visited[cr][cc]=true;
            cnt+=sol(cr+1,er,0,ec,tq,qpsf+1,visited);
            visited[cr][cc]=false;
        }
        cnt+=sol(cr,er,cc+1,ec,tq,qpsf,visited);
        return cnt;
    }
    public static boolean isSafe(int cr,int er,int cc,int ec,boolean visited[][])
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
