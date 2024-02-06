package array;

public class prefixSum 
{
    public static void main(String[] args) {
        int[] arr = {1,-2,6,-1,3};
        int[] prefix = new int[arr.length];
        int maxSum = Integer.MIN_VALUE;
        prefix[0]=arr[0];
        for(int i = 1;i<arr.length;i++)
        {
            prefix[i]=prefix[i-1]+arr[i];
        }

        for(int i = 0;i<arr.length;i++)   //start
        {
            for(int j = i ;j<arr.length;j++)  //end
            {   
                int curnSum = 0;
                if(i==0)
                {
                    curnSum = prefix[j];
                }
                else{

                    curnSum = prefix[j]-prefix[i-1];
                }
                maxSum = Math.max(maxSum,curnSum);
            }
        }
        System.out.println("max sum : "+maxSum);

    }
   
}
