package Array2D;

public class wave {
    public static void main(String[] args) {
        int row = 5;
        int col = 4;
        int[][] arr = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 },
                { 17, 18, 19, 20 } };

        sol(row,col,arr);
    }
    public static void sol(int row,int col,int[][]arr){
        for(int j=0;j<col;j++)
        {
            if(j%2==0)
            {
                for(int i=0;i<row;i++)
                {
                    System.out.print(arr[i][j]+" ");
                }
            }
            else {
                for(int i = row-1;i>=0;i--)
                {
                    System.out.print(arr[i][j]+" ");
                }
            }
        }
    }
}
