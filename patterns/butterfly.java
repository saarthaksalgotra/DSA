package patterns;

public class butterfly {
    public static void main(String[] args) {
        int n = 4;
        //upper
        for(int row = 1 ;row<=n;row++)
        {
            for(int col=1;col<=row;col++)
            {
                System.out.print("*");
            }

            for(int spc = 1;spc<=n-row;spc++)
            {
                System.out.print("  ");
            }

            for(int col=1;col<=row;col++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        //lower

        for(int row=n;row>=0;row--)
        {
            for(int col=1;col<=row;col++)
            {
                System.out.print("*");
            }

            for(int spc=1;spc<=n-row;spc++)
            {
                System.out.print("  ");
            }

            for(int col=1;col<=row;col++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
       
    }    
}
