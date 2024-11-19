package Assignment;

import java.util.Scanner;

public class Q3 {
    public static int findMaxValueOfEquation(int[][] points, int k) {
        int maxResult = Integer.MIN_VALUE;
        int n = points.length;

        for(int i = 0; i < n; ++i) {
            for(int j = i + 1; j < n; ++j) {
                if (Math.abs(points[i][0] - points[j][0]) <= k) {
                    int value = points[i][1] + points[j][1] + (points[j][0] - points[i][0]);
                    maxResult = Math.max(maxResult, value);
                }
            }
        }

        return maxResult;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] arr = new int[row][col];
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int k = sc.nextInt();
        System.out.println(findMaxValueOfEquation(arr, k));

    }
}
