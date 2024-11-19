package Assignment;

import java.util.Scanner;

public class Q5 {
    private static final int MOD = 1000000007;

    public static int minProduct(int p) {
        int n = (1 << p) - 1;
        long product = 1;
        for (int i = 1; i <= n; i++) {
            product = (product * i) % MOD;
        }
        return (int) product;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int ans = minProduct(p);
        System.out.println(ans);
    }
}
