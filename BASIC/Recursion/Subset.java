package BASIC.Recursion;

import java.util.ArrayList;

public class Subset {
    public static void main(String[] args) {
        int[] arr = {1,2,3};

        ArrayList<String> list = new ArrayList<>();
        sol(arr,0,"", list);
        System.out.print(list);
    }

    public static void sol(int[] arr,int idx , String ans, ArrayList<String> list)
    {

        if(idx>=arr.length)
        {
            list.add(ans);
            return;
        }
        //include
        sol(arr,idx+1,ans+arr[idx],list);

        //exclude
        sol(arr,idx+1,ans,list);
    }
}
