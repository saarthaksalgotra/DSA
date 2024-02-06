package sideQues;

public class primerange {
    public static void main(String[] args) {
        int n = 20;
        printRange(n);
    }

    public static void printRange(int n)
    {
        for(int i=2;i<=n;i++)
        {
            if(isPrime(i)==true)
            {
                System.out.print(i+" ");
            }
        }
    }

    public static boolean isPrime(int m)
    {
        for(int i=2;i<=Math.sqrt(m);i++)
        {
            if(m%i==0)
            {
                return false;
            }
        }

        return true;
    }
}