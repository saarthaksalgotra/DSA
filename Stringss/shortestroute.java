package Stringss;
import java.util.*;
public class shortestroute {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();

        int ans = shortest(str);
        System.out.print("Shortest Path: "+ans);
    }

    public static int shortest(String str)
    {
        int x = 0;
        int y = 0;

        for(int i=0;i<str.length();i++)
        {
            char ch =str.charAt(i);

            if(ch == 'n' || ch == 'N')
            {
                y++;
            }

            if(ch == 's' || ch == 'S')
            {
                y--;
            }

            if(ch == 'w' || ch == 'W')
            {
                x--;
            }

            if(ch == 'e' || ch== 'E')
            {
                x++;
            }

        }
        int res = (int)Math.sqrt((int)Math.pow(x, 2)+(int)Math.pow(y,2));
        return res;
    }
    
}
