package Stringss;
public class largestString {
    public static void main(String[] args) {
        String[] arr = {"apple" ,"banana","mango"};
        
        String largest = arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(largest.compareTo(arr[i])<0)
            {
                largest = arr[i];
            }
        }
        System.out.println(largest);
    }
    
}
