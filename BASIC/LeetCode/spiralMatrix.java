package BASIC.LeetCode;

public class spiralMatrix {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int sr = 0;
        int sc = 0;
        int er = arr.length-1;
        int ec = arr[0].length-1;
        int totalelement = arr.length* arr[0].length;
        int ep = 0;

        while(ep<totalelement)
        {
            for(int col = sc ; col<=ec ; col++)
            {
                System.out.print(arr[sr][col]+" ");
                ep++;
            }
            sr++;

            for(int row = sr ; row<=er ; row++)
            {
                System.out.print(arr[row][ec]+" ");
                ep++;
            }
            ec--;

            for(int col = ec ; col>=sc ; col--)
            {
                System.out.print(arr[er][col]+" ");
                ep++;
            }
            er--;

            for(int row = er ; row>=sr;row--)
            {
                System.out.print(arr[row][sc]+" ");
                ep++;
            }
            sc++;
        }
    }
}