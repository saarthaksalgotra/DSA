package reappear.COREJAVA;

import java.util.Scanner;
import java.util.Stack;

public class balancedParenthesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        if(sol(str))
        {
            System.out.print("1");
        }
        else
        {
            System.out.print("0");
        }
    }

    public static boolean sol(String str)
    {
        Stack<Character> st = new Stack<Character>();
        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);

            if(ch=='(')
            {
                st.push('(');
            } else if (ch==')' && st.empty()) {
                return  false;
            }
            else
            {
                st.pop();
            }
        }
        return st.empty();
    }

}