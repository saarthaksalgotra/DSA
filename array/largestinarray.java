package array;

public class largestinarray {
    public static void main(String[] args) {
        int[] arr = {192 , 253 , 626 , 400};
        int large = 0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>large)
            {
                large = arr[i];
            }
        }
        System.out.println(large);
    }
}
