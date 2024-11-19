package Assignment;

import java.util.*;

public class Q11 {

    private static boolean dfs(int node, Map<Integer, List<Integer>> graph, Set<Integer> visited, Set<Integer> set) {
        if (set.contains(node)) return true;

        if (visited.contains(node)) return false;
        visited.add(node);
        set.add(node);
        for (int neighbor : graph.getOrDefault(node, new ArrayList<>())) {
            if (dfs(neighbor, graph, visited, set)) {
                return true;
            }
        }
        set.remove(node);
        return false;
    }

    public int countWays(List<List<Integer>> pairs) {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        Set<Integer> allNodes = new HashSet<>();
        for (List<Integer> pair : pairs) {
            int x = pair.get(0);
            int y = pair.get(1);
            graph.putIfAbsent(x, new ArrayList<>());
            graph.get(x).add(y);

            allNodes.add(x);
            allNodes.add(y);
        }
        Set<Integer> visited = new HashSet<>();
        Set<Integer> inStack = new HashSet<>();
        for (int node : allNodes) {
            if (!visited.contains(node)) {
                if (dfs(node, graph, visited, inStack)) {
                    return 0;
                }
            }
        }
        int componentCount = 0;

        visited.clear();
        for (int node : allNodes) {
            if (!visited.contains(node)) {
                componentCount++;
                dfsComponent(node, graph, visited);
            }
        }
        if (componentCount > 1) {
            return 2;
        }
        return 1;
    }
    private void dfsComponent(int node, Map<Integer, List<Integer>> graph, Set<Integer> visited) {
        visited.add(node);
        for (int neighbor : graph.getOrDefault(node, new ArrayList<>())) {
            if (!visited.contains(neighbor)) {
                dfsComponent(neighbor, graph, visited);
            }
        }
    }
    public List<List<Integer>> readInput() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<List<Integer>> pairs = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            pairs.add(Arrays.asList(x, y));
        }

        return pairs;
    }

    public static void main(String[] args) {
        Q11 solution = new Q11();
        List<List<Integer>> pairs = solution.readInput();
        int result = solution.countWays(pairs);
        if (result == 0) {
            System.out.println("0");
        } else if (result == 1) {
            System.out.println("1");
        } else {
            System.out.println("2");
        }
    }
}
