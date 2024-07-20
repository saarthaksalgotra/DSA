package BASIC.Recursion;

public class factorial {
    public static void main(String[] args) {
        int ans = sol(6);
        System.out.println(ans);
    }

    public static int sol(int n)
    {
        if(n==1)
        {
            return 1;
        }

        int res = sol(n-1)*n;
        return res;
    }
}
