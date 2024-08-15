package BASIC.Backtracking;

public class RatchazesCheese {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        int [][] arr ={{0,0,1},{0,0,0},{0,0,1},{1,0,0}};
        int ans = sol(arr,0,0,arr.length-1,arr[0].length-1,"", new boolean[arr.length][arr[0].length]);
        System.out.print(ans);
    }

    public static int sol(int[][]arr , int cr , int cc , int er , int ec,String ans , boolean visited[][])
    {
        if(cr==er && cc == ec)
        {
            System.out.println(ans);
            return 1;
        }

        if(cr<0 || cc<0 ||cr>er || cc>ec || arr[cr][cc]==1 || visited[cr][cc]==true)
        {
            return 0;
        }

        visited[cr][cc] = true;
        int cnt = 0;
        cnt += sol(arr, cr + 1, cc, er, ec, ans + 'D',visited);
        cnt += sol(arr, cr, cc + 1, er, ec, ans + 'R',visited);
        cnt += sol(arr , cr-1 , cc , er, ec,ans+'U',visited);
        cnt += sol(arr , cr, cc-1 , er , ec , ans+'L',visited);
        visited[cr][cc] = false;
        return cnt;
    }
}
