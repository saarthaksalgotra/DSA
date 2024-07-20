package BASIC.Recursion;
import java.util.Scanner;
public class MazePath {
    public static void main(String []args) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();

        int[][] arr = new int[row][col];

        int res = paths(0,0,arr.length-1,arr[0].length-1,"");
        System.out.println();
        System.out.print(res);
    }

    public static int paths(int cr , int cc , int er , int ec , String ans)
    {
        if(cr == er && cc == ec)
        {
            System.out.print(ans+" ");
            return 1;
        }

        if(cr > er || cc > ec)
        {
            return 0;
        }

        int cnt = 0;
        cnt += paths(cr+1 , cc , er , ec, ans+"V");
        cnt += paths(cr , cc+1 , er , ec , ans+"H");
//        if(cr==cc)
//        {
//            cnt += paths(cr+1 , cc+1 , er , ec , ans+"D");
//        }

        return cnt;
    }
}
