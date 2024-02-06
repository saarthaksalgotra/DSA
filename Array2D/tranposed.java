package Array2D;

public class tranposed {
    public static void main(String[] args) {
        int row =2;
        int col =3;
        int[][] matrix = {{11,12,13},{21,22,23}};
        int[][] tranpose = new int[col][row];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                tranpose[j][i]=matrix[i][j];
            }
        }

        for(int i=0;i<tranpose.length;i++)
        {
            for(int j=0 ; j<tranpose[0].length;j++)
            {
                System.out.print(tranpose[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}
