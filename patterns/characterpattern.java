package patterns;

public class characterpattern {
    public static void main(String[] args) 
    {
        char ch='A';
        for(int row=1;row<=4;row++)
        {
            for(int col=1;col<=row;col++)
            {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
    
}