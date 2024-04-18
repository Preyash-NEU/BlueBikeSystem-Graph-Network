package GraphPSA;

import java.util.*;

public class BFSAlgorithm {
    private GraphNetwork graph;

    public BFSAlgorithm(GraphNetwork graph) {
        this.graph = graph;
    }

    public void bfs(char startVertex) {
        Set<Character> visited = new HashSet<>();
      
        Queue<Character> queue = new LinkedList<>();
        
        queue.add(startVertex);
        visited.add(startVertex);

        // BFS traversal
        while (!queue.isEmpty()) {
            char currentVertex = queue.poll();
            System.out.print(currentVertex + " ");

            Map<Character, Integer> neighbors = graph.graph.get(currentVertex);

            if (neighbors != null) {
                for (char neighbor : neighbors.keySet()) {
                    if (!visited.contains(neighbor)) {
                        queue.add(neighbor);
                        visited.add(neighbor);
                    }
                }
            }
        }
    }
}
