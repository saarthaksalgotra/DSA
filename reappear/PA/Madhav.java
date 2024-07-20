package reappear.PA;

import java.util.Scanner;

public class Madhav {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int count = 0;
        int k = 1;
        while (count < N) {
            int houseNumber = 3 * k + 2;
            if (houseNumber % M != 0) {
                System.out.println(houseNumber);
                count++;
            }
            k++;
        }

    }
}
