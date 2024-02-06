package sideQues;

public class binomialCoefficient {
    public static void main(String[] args) {
        int n=10;
        int r=2;
        int ans=binomial(n,r);
        System.out.print(ans);
    }

    public static int binomial(int n, int r)
    {
        int nfact=1;
        int rfact=1;
        int xfact=1;
        for(int i=1;i<=n;i++)
        {
            nfact = nfact*i;
        }

        for(int i=1;i<=r;i++)
        {
            rfact = rfact*i;
        }

        int x=n-r;
        for(int i=1;i<=x;i++)
        {
            xfact = xfact*i;
        }

        int coefficient=nfact/(xfact*rfact);
        return coefficient;
    }
}
