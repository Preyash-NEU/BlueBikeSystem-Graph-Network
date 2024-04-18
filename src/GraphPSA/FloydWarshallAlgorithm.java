package GraphPSA;

import java.util.HashMap;
import java.util.Map;

public class FloydWarshallAlgorithm {
    private GraphNetwork graph;
    private static final int INF = Integer.MAX_VALUE / 2; // Set a large value as infinity

    public FloydWarshallAlgorithm(GraphNetwork graph) {
        this.graph = graph;
    }

    public void floydWarshall() {
        Map<Character, Map<Character, Integer>> distance = new HashMap<>(graph.graph);

        // Initialize the distance matrix
        for (char u : graph.graph.keySet()) {
            distance.putIfAbsent(u, new HashMap<>()); // Ensure each vertex has a mapping
            for (char v : graph.graph.keySet()) {
                if (u != v && !distance.get(u).containsKey(v)) {
                    distance.get(u).put(v, INF); // Initialize to infinity if no direct edge
                }
            }
        }

        // Apply Floyd-Warshall algorithm
        for (char k : graph.graph.keySet()) {
            for (char i : graph.graph.keySet()) {
                for (char j : graph.graph.keySet()) {
                    Integer distIK = distance.get(i).get(k);
                    Integer distKJ = distance.get(k).get(j);
                    if (distIK != null && distKJ != null) { // Check for null values before accessing intValue()
                        Integer currentDistIJ = distance.get(i).get(j);
                        int newDist = distIK + distKJ;
                        if (currentDistIJ == null || newDist < currentDistIJ) {
                            distance.get(i).put(j, newDist);
                        }
                    }
                }
            }
        }

        // Print the shortest distances between all pairs of vertices
        System.out.println("Shortest distances between all pairs of vertices:");
        for (char u : graph.graph.keySet()) {
            for (char v : graph.graph.keySet()) {
                Integer dist = distance.get(u).get(v);
                if (dist == null || dist == INF) {
                    System.out.print("INF ");
                } else {
                    System.out.print(dist + " ");
                }
            }
            System.out.println();
        }
    }
}
