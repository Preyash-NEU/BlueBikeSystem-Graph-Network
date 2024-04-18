package GraphPSA;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DFSAlgorithm {
    private GraphNetwork graph;

    public DFSAlgorithm(GraphNetwork graph) {
        this.graph = graph;
    }

    // Depth-First Search traversal
    public void dfs(char start) {
        Set<Character> visited = new HashSet<>();
        dfsHelper(start, visited);
    }

    private void dfsHelper(char vertex, Set<Character> visited) {
        visited.add(vertex);
        System.out.print(vertex + " ");

        Map<Character, Integer> neighbors = graph.graph.get(vertex);
        for (char neighbor : neighbors.keySet()) {
            if (!visited.contains(neighbor)) {
                dfsHelper(neighbor, visited); //recursive call
            }
        }
    }
}

