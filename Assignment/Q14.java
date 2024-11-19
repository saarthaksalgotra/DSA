package Assignment;

import java.awt.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Q14 {
    public static int[] sol(int[] asteroids) {
        Stack<Integer> stack = new Stack();
        int[] result = asteroids;
        int i = asteroids.length;

        for(int var5 = 0; var5 < i; ++var5) {
            int asteroid = result[var5];
            boolean collision = false;

            while(!stack.isEmpty() && asteroid < 0 && (Integer)stack.peek() > 0) {
                int top = (Integer)stack.peek();
                if (Math.abs(asteroid) <= Math.abs(top)) {
                    if (Math.abs(asteroid) == Math.abs(top)) {
                        stack.pop();
                        collision = true;
                    } else {
                        collision = true;
                    }
                    break;
                }

                stack.pop();
            }

            if (!collision) {
                stack.push(asteroid);
            }
        }

        result = new int[stack.size()];

        for(i = 0; i < stack.size(); ++i) {
            result[i] = (Integer)stack.get(i);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] asteroids = new int[n];
        for (int i=0;i<asteroids.length;i++)
        {
            asteroids[i] = sc.nextInt();
        }

        int[] res = sol(asteroids);

        for(int val: res)
        {
            System.out.print(val+" ");
        }

    }
}
