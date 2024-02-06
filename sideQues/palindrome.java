package sideQues;

public class palindrome {
    public static void main(String[] args) {
        int n = 121;

        boolean res = checkPalindrome(n);
        System.out.print(res);
    }

    public static boolean checkPalindrome(int n)
    {
        int rem=0;
        int check=n;
        int temp=0;
        
        while(n>0)
        {
            rem=n%10;
            temp=(temp*10)+rem;
            n=n/10;
        }

        if(check==temp)
        {
            return true;
        }

        return false;
    }
}
