package patterns;

public class diamond {
    public static void main(String[] args) {
        int n =5;
        for(int row=1;row<=n;row++)
        {
            for(int spc=1;spc<=n-row;spc++)
            {
                System.out.print(" ");
            }

            for(int col=1;col<=row;col++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int row=n-1;row>=0;row--)
        {
            for(int spc = 1;spc<=n-row;spc++)
            {
                System.out.print(" ");
            }
            for(int col=1;col<=row;col++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}