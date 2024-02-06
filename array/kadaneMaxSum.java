package array;

public class kadaneMaxSum {
    public static void main(String[] args) {
        int[] arr = {-2,-1,-3,-4,-1,-2,-1,-5,-4};
        kadane(arr);
    }    

    // when maxSum = 0 then print highest negative number

    public static void kadane(int[] arr)
    {
        int curnSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++)
        {
            curnSum = curnSum + arr[i];
            if(curnSum<0)
            {
                curnSum = 0;
            }

            maxSum = Math.max(maxSum,curnSum);
        }

        if(maxSum == 0)
        {
            int max = arr[0];
            for(int i = 0;i < arr.length;i++ )
            {
                if(arr[i]<max)
                {
                    max = arr[i];
                }
            }
            System.out.println("Max sum: "+max);
        }
        else{

            System.out.println("Max sum: "+ maxSum);
        }
    
        
    }
}
