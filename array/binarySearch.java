package array;

public class binarySearch {
    public static void main(String[] args) {
        int[] arr = {2,3,4,7,8,9,20,45};
        int key = 45;
        int idx = search(arr,key);
        if(idx==-1)
        {
            System.out.println("invalid key!");
        }
        else
        {
            System.out.println("key is at: " + idx);
        }
    }   

    public static int search(int[] arr, int key)
    {
        int start = 0;
        int end = arr.length-1;
        while(start<=end){

            int mid = (start+end)/2;
    
            if(arr[mid]==key)
            {
                return mid;
            }
    
            if(arr[mid]<key)
            {
                start = mid+1;
            }
            else
            {
                end = mid-1;
            }
        }
        return -1;
    }
}