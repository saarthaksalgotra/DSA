package Array2D;

public class print7s {
    public static void main(String[] args) {
        int[][] matrix = {{4,7,8},{8,8,7}};

        count(matrix);
    }

    public static void count(int[][] matrix)
    {
        int seven = 0;

        for(int i = 0 ;i<matrix.length;i++)
        {
            for(int j = 0;j<matrix[0].length;j++)
            {
                if(matrix[i][j]==7)
                {
                    seven++;
                }
            }
        }
        System.out.print(seven);
    }
    
}
