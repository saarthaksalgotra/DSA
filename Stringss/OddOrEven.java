package Stringss;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine(); // Example input string

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (i % 2 == 0) {
                result.append((char)(currentChar + 1)); // Decrease ASCII value if index is even
            } else {
                result.append((char)(currentChar - 1)); // Increase ASCII value if index is odd
            }
        }

        System.out.println("Modified string: " + result.toString());
    }
}
