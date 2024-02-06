package Array2D;

import java.util.Scanner;

public class matrixSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matrix  = new int[3][3];

        for(int i=0;i<matrix.length;i++)
        {
            for(int j = 0;j<matrix.length;j++)
            {
                matrix[i][j] = sc.nextInt();
            }
        }

        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix.length;j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        int key =sc.nextInt();
        sc.close();
        search(matrix,key);
    }

    public static void search(int[][] matrix,int key)
    {
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix.length;j++)
            {
                if(matrix[i][j]==key)
                {
                    System.out.println("key found at: "+i +","+j);
                }
            }
        }
    }
}
