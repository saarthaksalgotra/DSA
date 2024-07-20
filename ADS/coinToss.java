package ADS;
import java.util.*;

public class coinToss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        //sol(n,"");
        outcome(n,"",' ');
    }

    public static void sol(int n,String ans)
    {
        if(n==0)
        {
            System.out.println(ans);
            return;
        }

        sol(n-1,ans+"H");
        sol(n-1,ans+"T");
    }

    public static void outcome(int n,String ans,char ch)
    {
        if(n==0)
        {
            System.out.println(ans);
            return;
        }

       if(ch!='H'){
            outcome(n-1,ans+"H",'H');
       }
    outcome(n-1,ans+"T",'T');

    }


}
