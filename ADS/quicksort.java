package ADS;

public class quicksort {
    public static void main(String[] args) {
		int[] arr= {9,8,6,4,2,1,2,4,5,6,7,4};
		quick_sort(arr,0,arr.length-1);
		for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
	}

	private static void quick_sort(int[] arr, int lo, int hi) {
		if(hi<=lo) {
			return;
		}
		int idx=partition(arr,lo,hi);
		quick_sort(arr,lo,idx-1);
		quick_sort(arr,idx+1,hi);
	}

	private static int partition(int[] arr, int lo, int hi) {
		int pivot=arr[hi];
		int idx=lo;
		for(int i=lo;i<hi;i++) {
			if(arr[i]<=pivot) {
				swap(arr,idx,i);
				idx++;
			}
		}
		swap(arr,idx,hi);
		return idx;
	}

	private static void swap(int[] arr, int idx, int i) {
		int temp=arr[i];
		arr[i]=arr[idx];
		arr[idx]=temp;
	}
}