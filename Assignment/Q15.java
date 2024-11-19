package Assignment;

import java.util.Scanner;

public class Q15 {
    public static boolean sol(char[][] board, String word) {
        if (board != null && word != null && !word.isEmpty() && board.length != 0 && board[0].length != 0) {
            int m = board.length;
            int n = board[0].length;

            for(int i = 0; i < m; ++i) {
                for(int j = 0; j < n; ++j) {
                    if (board[i][j] == word.charAt(0)) {
                        boolean[][] visited = new boolean[m][n];
                        if (dfs(board, word, 0, i, j, visited)) {
                            return true;
                        }
                    }
                }
            }

            return false;
        } else {
            return false;
        }
    }

    private static boolean dfs(char[][] board, String word, int index, int i, int j, boolean[][] visited) {
        if (index == word.length()) {
            return true;
        } else if (i >= 0 && j >= 0 && i < board.length && j < board[0].length && !visited[i][j] && board[i][j] == word.charAt(index)) {
            visited[i][j] = true;
            boolean result = dfs(board, word, index + 1, i + 1, j, visited) || dfs(board, word, index + 1, i - 1, j, visited) || dfs(board, word, index + 1, i, j + 1, visited) || dfs(board, word, index + 1, i, j - 1, visited);
            visited[i][j] = false;
            return result;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = sc.nextInt();
        int m = sc.nextInt();
        char[][] arr = new char[n][m];

        for(int i=0;i<n;i++)
        {
            String row = sc.next();
            for(int j=0;j<m;j++)
            {
                arr[i][j]=row.charAt(j);
            }
        }

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        boolean ans = sol(arr,str);
        System.out.print(ans);
    }
}
