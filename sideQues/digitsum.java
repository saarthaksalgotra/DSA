package sideQues;

public class digitsum {
    public static void main(String[] args) {
        int num = 25;
       int res = digitSum(num);
       System.out.print(res);
    }

    public static int digitSum(int n)
    {
        int sum=0;
        int rem=0;
        while(n>0)
        {
            rem=n%10;
            sum=sum+rem;
            n=n/10;
        }
        return sum;
    }
}
