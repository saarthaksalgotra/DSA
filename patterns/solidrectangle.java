package patterns;
public class solidrectangle {
    public static void main(String[] args) {
        int row=0;
        while(row<4)
        {
            int col=0;
            while(col<5)
            {
                System.out.print("*");
                col++;
            }
            row++;
            System.out.println();
        }
        
    }
}
