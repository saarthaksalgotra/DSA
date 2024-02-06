package patterns;

public class hollowrohmbus {
    public static void main(String[] args) {
        int n=5;
        for(int row=1;row<=n;row++)
        {
            for(int spc=1;spc<=n-row;spc++)
            {
                System.out.print(" ");
            }
            for(int col=1;col<=n;col++)
            {
                if(row==1||row==n||col==1||col==n)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }    
}
