package array;

public class trappingRainWater {
    public static void main(String[] args) {
        int[] arr = {4,2,0,6,3,2,5};

        int ans = trappedWater(arr);
        System.out.println(ans);
    }

    
    public static int trappedWater(int[] arr)
    {
        //left
        int[] maxleft = new int[arr.length];
        maxleft[0] = arr[0];
        for(int i=1;i<arr.length;i++)
        {
            maxleft[i]=Math.max(arr[i],maxleft[i-1]);
        }

        //right
        int[] maxrigth = new int[arr.length];
        maxrigth[arr.length-1] = arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--)
        {
            maxrigth[i] = Math.max(arr[i],maxrigth[i+1]);
        }

        //waterloop
        int trapped = 0;
        for(int i=0;i<arr.length;i++)
        {
            int waterlevel = Math.min(maxleft[i],maxrigth[i]);
            trapped += waterlevel - arr[i];
        } 
        return trapped;
    } 
}