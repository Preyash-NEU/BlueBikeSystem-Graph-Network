package GraphPSA; //Main Build Package

import java.util.*;

public class SingleSourceShortestPath {
    private GraphNetwork graph;

    public SingleSourceShortestPath(GraphNetwork graph) {
        this.graph = graph;
    }

    public Map<Character, Integer> dijkstra(char source) {
        Map<Character, Integer> distance = new HashMap<>();
        Map<Character, Boolean> visited = new HashMap<>();
        PriorityQueue<Map.Entry<Character, Integer>> minHeap = new PriorityQueue<>(Comparator.comparingInt(Map.Entry::getValue));

        // Initialize distances and visited map
        for (char vertex : graph.graph.keySet()) {
            distance.put(vertex, Integer.MAX_VALUE);
            visited.put(vertex, false);
        }

        // Set distance of source vertex to 0 and add to minHeap
        distance.put(source, 0);
        minHeap.add(new AbstractMap.SimpleEntry<>(source, 0));

        while (!minHeap.isEmpty()) {
            char currentVertex = minHeap.poll().getKey();
            visited.put(currentVertex, true);

            // Update distances of adjacent vertices
            for (Map.Entry<Character, Integer> neighbor : graph.graph.get(currentVertex).entrySet()) {
                char neighborVertex = neighbor.getKey();
                int neighborWeight = neighbor.getValue();

                if (!visited.get(neighborVertex)) {
                    int newDistance = distance.get(currentVertex) + neighborWeight;
                    if (newDistance < distance.get(neighborVertex)) {
                        distance.put(neighborVertex, newDistance);
                        minHeap.add(new AbstractMap.SimpleEntry<>(neighborVertex, newDistance));
                    }
                }
            }
        }

        return distance;
    }
}

