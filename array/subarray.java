package array;

public class subarray {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10};
        int cnt=0;
        for(int i=0;i<arr.length;i++) //start
        {
            for(int j=i;j<arr.length;j++)  //end
            {
                for(int k=i;k<=j;k++)  //print between start to end
                {
                    System.out.print(arr[k]+" ");
                    
                }
                System.out.println();
                cnt++;
            } 
            System.out.println();
        }
        System.out.println("total subaaray: "+cnt);
    }
}