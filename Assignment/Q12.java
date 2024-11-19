package Assignment;

import java.util.Scanner;

public class Q12 {
    public static int sol(String s) {
        char[] arr = s.toCharArray();
        int n = arr.length;

        int operations;
        for(operations = 0; !isSorted(arr); operations = (operations + 1) % 1000000007) {
            int i = -1;

            for(int j = 1; j < n; ++j) {
                if (arr[j] < arr[j - 1]) {
                    i = j;
                }
            }

            if (i == -1) {
                break;
            }

            char pivot = arr[i - 1];
            int j = i;

            for(int k = i; k < n; ++k) {
                if (arr[k] < pivot) {
                    j = k;
                }
            }

            char temp = arr[i - 1];
            arr[i - 1] = arr[j];
            arr[j] = temp;
            reverse(arr, i);
        }

        return operations;
    }

    private static boolean isSorted(char[] arr) {
        for(int i = 1; i < arr.length; ++i) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }

        return true;
    }

    private static void reverse(char[] arr, int i) {
        int left = i;

        for(int right = arr.length - 1; left < right; --right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            ++left;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int res = sol(str);
        System.out.print(res);
    }
}
