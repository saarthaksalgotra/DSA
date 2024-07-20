package BASIC.Sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int [] arr = {3,5,2,1,4};

        sol(arr);
    }

    public static void sol(int[] arr) {

        for(int i = 0;i<arr.length-1;i++)
        {
            int min = i;

            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]<arr[min])
                {
                    min = j;
                }
            }

            //swap
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }

        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
