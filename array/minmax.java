package array;
import java.util.*;
public class minmax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];

        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        sc.close();

        Arrays.sort(arr);

        System.out.println("min: " + arr[0]);
        System.out.println("max: "+ arr[size-1]);
    }    
}
