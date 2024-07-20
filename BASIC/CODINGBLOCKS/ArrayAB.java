package BASIC.CODINGBLOCKS;
import java.util.Scanner;

public class ArrayAB {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[] a=new int[n];
        int[] b=new int[m];

        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<b.length;i++)
        {
            b[i]=sc.nextInt();
        }

        sol(a,b,0,0,-1,true,"");
    }
    public static void sol(int[] a,int[] b,int idxa,int idxb,int prev,boolean flag,String ans)
    {
        if(flag==true && ans.length()!=0)
        {
            System.out.println(ans);
        }

        if(flag==true)
        {
            for(int i=idxa;i<a.length;i++)
            {

                if(prev<a[i])
                {
                    sol(a,b,i+1,idxb,a[i],false,ans+a[i]+" ");
                }
            }
        }
        else
        {
            for(int i=idxb;i<b.length;i++)
            {
                if(prev<b[i])
                {
                    sol(a,b,idxa,i+1,b[i],true,ans+b[i]+" ");
                }
            }
        }
    }
}
