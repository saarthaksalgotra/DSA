package Assignment;

import java.util.Scanner;

public class Q13 {
    public static double sol(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            int[] temp = nums1;
            nums1 = nums2;
            nums2 = temp;
        }

        int m = nums1.length;
        int n = nums2.length;
        int left = 0;
        int right = m;

        while(left <= right) {
            int partition1 = (left + right) / 2;
            int partition2 = (m + n + 1) / 2 - partition1;
            int maxLeft1 = partition1 == 0 ? Integer.MIN_VALUE : nums1[partition1 - 1];
            int minRight1 = partition1 == m ? Integer.MAX_VALUE : nums1[partition1];
            int maxLeft2 = partition2 == 0 ? Integer.MIN_VALUE : nums2[partition2 - 1];
            int minRight2 = partition2 == n ? Integer.MAX_VALUE : nums2[partition2];
            if (maxLeft1 <= minRight2 && maxLeft2 <= minRight1) {
                if ((m + n) % 2 == 1) {
                    return (double)Math.max(maxLeft1, maxLeft2);
                }

                return (double)(Math.max(maxLeft1, maxLeft2) + Math.min(minRight1, minRight2)) / 2.0;
            }

            if (maxLeft1 > minRight2) {
                right = partition1 - 1;
            } else {
                left = partition1 + 1;
            }
        }

        throw new IllegalArgumentException("Input arrays are not sorted properly.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr1 = new int[n];
        for(int i=0;i<arr1.length;i++)
        {
            arr1[i] = sc.nextInt();
        }

        int[] arr2 = new int[m];
        for(int i=0;i<arr2.length;i++)
        {
            arr2[i] = sc.nextInt();
        }

        double res = sol(arr1,arr2);
        System.out.print(res);
    }
}
