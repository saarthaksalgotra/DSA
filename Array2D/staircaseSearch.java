package Array2D;

public class staircaseSearch {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        int key = 6;
        search(matrix,key);
    }

    public static boolean search(int[][] matrix , int key)
    {
        int row = 0 ; 
        int col = matrix[0].length-1;

        while(row < matrix.length && col >= 0)
        {
            if(matrix[row][col]==key)
            {
                System.out.print("key found at: ("+row+","+col+")");
                return true;
            }

            else if (key < matrix[row][col]) {
                col--;
            }
            else{
                row++;
            }
        }

        System.out.print("invalid key!!");
        return false;
    }
    
}