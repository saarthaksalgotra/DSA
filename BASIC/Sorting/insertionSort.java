package BASIC.Sorting;

public class insertionSort {
    public static void main(String[] args) {
        int[] arr = {1,23,45,3,0};
        sol(arr);
    }
    public static void sol(int[] arr)
    {
        for(int i = 1 ; i<arr.length;i++)
        {
            int val = arr[i];
            int j=i-1;
            for(;j>=0;j--)
            {
                if(arr[j]>val)
                {
                    arr[j+1]=arr[j];
                }
                else
                {
                    break;
                }
            }
            arr[j+1]= val;
        }

        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
