package ADS;
import java.util.*;
public class MergeSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }

        sc.close();
        int[]res = mergesort(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(res[i]+" ");
        }
    }

    public static int[] mergesort(int[] arr , int lo , int hi)
    {
        if(lo==hi)
        {
            int[] ans = new int[1];
            ans[0] = arr[lo];
            return ans;
        }
        
        int mid = (lo+hi)/2;
        int[] arr1 = mergesort(arr, lo, mid);
        int[] arr2 = mergesort(arr, mid+1, hi);

        return merge(arr1, arr2);
    }

    public static int[] merge(int[] arr1, int[] arr2){
        int p= arr1.length+arr2.length;
        int[] ans= new int[p];
        int i=0;
        int j=0; 
        int k=0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                ans[k++]=arr1[i++];
            }
            else{
                ans[k++]=arr2[j++];
            }
        }
        while(i< arr1.length){
            ans[k++]=arr1[i++];
        }
        while(j< arr2.length){
            ans[k++]=arr2[j++];
        }
        return ans;
    }
}