package Stringss;
public class substrings {
    public static void main(String[] args) {
        // String str = "Physics";

        // for(int i=2;i<4;i++)
        // {
        //     System.out.print(str.substring(2));
        // }


        String s1= "abcd";
        for(int i=0;i<s1.length();i++)
        {
            for(int j=i+1;j<=s1.length();j++)
            {
                System.out.println(s1.substring(i,j)+" ");
            }
        }

       
    }
}
