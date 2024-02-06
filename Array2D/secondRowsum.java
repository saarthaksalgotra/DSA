package Array2D;

public class secondRowsum {
    public static void main(String[] args) {
        int[][] matrix = {{1,4,9},{11,4,3},{2,2,3}};
        sum(matrix);
    }

    public static void sum(int[][] matrix)
    {
        int ans = 0;

            for(int j=0;j<matrix.length;j++)
            {
                ans+=matrix[1][j];
            }

        System.out.print(ans);
    }
    
}
