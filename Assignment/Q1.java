package Assignment;

import java.util.Scanner;

public class Q1 {
    public static void shiftRight(int[] A, int i, int j) {
        if (A != null && i >= 0 && j < A.length && i < j) {
            for(int k = j; k > i; --k) {
                A[k] = A[k - 1];
            }

        } else {
            throw new IllegalArgumentException("Invalid array or indices");
        }
    }

    public static int[][] createRandomMatrix(int rows, int cols, int min, int max) {
        if (rows > 0 && cols > 0 && min <= max) {
            int[][] matrix = new int[rows][cols];

            for(int i = 0; i < rows; ++i) {
                for(int j = 0; j < cols; ++j) {
                    matrix[i][j] = min + (int)(Math.random() * (double)(max - min + 1));
                }
            }

            return matrix;
        } else {
            throw new IllegalArgumentException("Invalid parameters for matrix creation");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
        int[] var2 = arr;
        int i = arr.length;
        int j;
        int num;
        shiftRight(arr, 1, 4);
        var2 = arr;
        i = arr.length;

        for(j = 0; j < i; ++j) {
            num = var2[j];
            System.out.print(num + " ");
        }

        int[][] matrix = createRandomMatrix(3, 4, 10, 50);
        System.out.println("\nRandom Matrix:");

        for(i = 0; i < matrix.length; ++i) {
            for(j = 0; j < matrix[i].length; ++j) {
                System.out.print(matrix[i][j] + " ");
            }

            System.out.println();
        }

    }
}
