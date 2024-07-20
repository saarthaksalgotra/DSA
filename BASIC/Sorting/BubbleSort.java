package BASIC.Sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {2,5,1,8};
        sol(arr);
    }
    public static void sol(int[]arr)
    {
        for(int i=0;i<arr.length-1;i++)  // ye loop ek ek krke har element ko uski shi jgh pr chhod kr ayega
        {
            boolean flag = false;
            for(int j = 0;j<arr.length-1-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true;
                }
            }

            if(flag = false)
            {
                break;
            }
        }

        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

}
