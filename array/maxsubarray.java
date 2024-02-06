package array;

public class maxsubarray {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10};
       
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0;i<arr.length;i++)
        {
            for(int j = i;j<arr.length;j++)
            {
                int curnSum = 0;
                for(int k = i ; k <= j; k++)
                {
                    curnSum += arr[k];    
                }
                maxSum = Math.max(maxSum, curnSum);
            }  
        }
        System.out.println("max sum: "+maxSum);
    }
}
