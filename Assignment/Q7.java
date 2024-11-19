package Assignment;

import java.util.Scanner;

public class Q7 {
    public static int celebrity(int[][] mat) {
        int n = mat.length;
        int candidate = 0;

        int i;
        for(i = 1; i < n; ++i) {
            if (mat[candidate][i] == 1) {
                candidate = i;
            }
        }

        for(i = 0; i < n; ++i) {
            if (i != candidate && (mat[candidate][i] == 1 || mat[i][candidate] == 0)) {
                return -1;
            }
        }

        return candidate;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] matrix = new int[n][m];
        for(int i=0;i< matrix.length;i++)
        {
            for(int j=0;j< matrix[0].length;j++)
            {
                matrix[i][j] = sc.nextInt();
            }
        }

        int ans = celebrity(matrix);
        System.out.print(ans);
    }
}
