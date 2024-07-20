package BASIC.Recursion;

import java.util.Scanner;

public class BoardPath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dest = sc.nextInt();
        int dice = sc.nextInt();
        int ans = paths(0,dest,dice);
        System.out.print(ans);
    }

    public static int paths(int src , int dest , int dice)
    {
        if(src==dest)
        {
            return 1;
        }

        if(src>dest)
        {
            return 0;
        }
        int cnt = 0;
        if(src==0 && (dice == 1 || dice == 6))
        {
            cnt+=paths(src+1,dest,dice);
        }
        else {
            for (int i = 1; i <= dice; i++) {
                cnt += paths(src + i, dest, dice);
            }
        }

        return cnt;
    }
}
