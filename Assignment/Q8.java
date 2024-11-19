package Assignment;

import java.util.Scanner;
import java.util.Stack;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int ans = longestValidParentheses(str);
        System.out.print(ans);
    }

    public static int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        int maxLength = 0;

        for(int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            } else {
                stack.pop();
                if (!stack.isEmpty()) {
                    int length = i - (Integer)stack.peek();
                    maxLength = Math.max(maxLength, length);
                } else {
                    stack.push(i);
                }
            }
        }

        return maxLength;
    }
}
