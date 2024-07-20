package BASIC.Recursion;

public class Subsequencesum {
    public static void main(String[] args) {
        int[] arr = {1,1,1,1,1,1};


        boolean ans = sol(arr,0, 0 ,5 );
        int res = count(arr , 0 , 0 , 5);
        System.out.println(res);
        System.out.print(ans);
    }

    public static boolean sol(int[] arr ,int idx , int sum ,int trgt )
    {
        if(sum>trgt) return false;
        if(sum==trgt)
        {

            return true;
        }


        if(idx>=arr.length)return false;

        boolean in = sol(arr,idx+1,sum+arr[idx],trgt );
        boolean ex = sol(arr,idx+1,sum,trgt );

        return in || ex;
    }

    public static int count(int[] arr , int idx , int sum , int trgt )
    {
        if(sum>trgt) return 0;
        if(sum==trgt)
        {
            return 1;
        }


        if(idx>=arr.length)return 0;
        int cnt = 0;
        cnt += count(arr,idx+1,sum+arr[idx],trgt);
        cnt += count(arr,idx+1,sum,trgt );

        return cnt;
    }

}
