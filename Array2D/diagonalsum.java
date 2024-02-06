package Array2D;

public class diagonalsum {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        
        sum(matrix);
    }

    public static void sum(int[][] matrix)
    {
        int sum = 0;

        //brute
        // for(int i=0;i<matrix.length;i++)
        // {
        //     for(int j = 0;j<matrix.length;j++)
        //     {
        //         if(i==j)
        //         {
        //             sum += matrix[i][j];
        //         }

        //         if(i+j==matrix.length-1)
        //         {
        //             sum+= matrix[i][j];
        //         }
        //     }
        // }

        //optimal
        for(int i=0;i<matrix.length;i++)
        {
            sum+=matrix[i][i];
            
            if(i!=matrix.length-1-i)
            {
                sum+=matrix[i][matrix.length-i-1];
            }
        }
        System.out.print(sum);
    }
    
}
