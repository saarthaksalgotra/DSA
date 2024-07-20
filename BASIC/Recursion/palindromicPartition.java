package BASIC.Recursion;

public class palindromicPartition {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String str="nitin";
        sol(str,"");

    }
    public static void sol(String str,String ans)
    {if(str.length()==0)
    {
        System.out.println(ans+" ");
        return ;
    }
        for(int i=0;i<str.length();i++)
        {
            String rem=str.substring(i+1);
            String cur=str.substring(0,i+1);
            if(isPalindrome(cur)==true)
            {
//				System.out.println(cur);
                sol(rem,ans+cur);

            }

        }
    }
    public static boolean isPalindrome(String str)
    {
        int i=0;
        int j=str.length()-1;
        while(i<=j)
        {
            if(str.charAt(i)==str.charAt(j))
            {
                i++;
                j--;
            }
            else {
                return false;
            }
        }
        return true;
    }
}
