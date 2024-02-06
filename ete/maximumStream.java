package ete;

import java.util.*;

public class maximumStream {
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: Number of elements in the stream
        int n = sc.nextInt();

        // Input: Elements of the stream
        int[] stream = new int[n];
        for (int i = 0; i < n; i++) {
            stream[i] = sc.nextInt();
        }

        sc.close();

        // Priority queue to keep track of the maximum element
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> Integer.compare(b, a));

        // Output: Maximum element at any point of time
        for (int i = 0; i < n; i++) {
            maxHeap.add(stream[i]);
            System.out.print(maxHeap.peek() + " ");
        }
    }
}