package Assignment;
import java.util.*;
public class Q10 {
    static class Node {
        int val;
        Node left;
        Node right;
        Node(int val)
        {
            this.val = val;
        }
    }
    public static int sol(Node root, int k) {
        if (root == null) return -1;
        List<Integer> levelSums = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            int levelSum = 0;
            for (int i = 0; i < levelSize; i++) {
                Node node = queue.poll();
                levelSum += node.val;
                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
            }
            levelSums.add(levelSum);
        }
        if (levelSums.size() < k) return -1;
        Collections.sort(levelSums, Collections.reverseOrder());
        return levelSums.get(k - 1);
    }
    public static Node createTree(Integer[] arr) {
        if (arr == null || arr.length == 0) return null;

        Node root = new Node(arr[0]);
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        int i = 1;
        while (i < arr.length) {
            Node current = queue.poll();
            if (arr[i] != null) {
                current.left = new Node(arr[i]);
                queue.offer(current.left);
            }
            i++;
            if (i < arr.length && arr[i] != null) {
                current.right = new Node(arr[i]);
                queue.offer(current.right);
            }
            i++;
        }

        return root;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        Integer[] arr = new Integer[n] ;
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
        Node root = createTree(arr);
        System.out.println(sol(root, k));
    }
}
